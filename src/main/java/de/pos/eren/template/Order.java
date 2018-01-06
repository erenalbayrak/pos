package de.pos.eren.template;

public abstract class Order
{
    // Das Grundgerüst
    final public void doOrder()
    {
        parseSelectedArticles();

        if (validateAddressAndBankDetais())
        {
            if (isCollectingPaybackPoints()) {
                pushPointsToPayback();
            }
            executeOrder();
        }
    }

    // Algorithmus muss in Unterklasse implementiert werden.
    abstract void parseSelectedArticles();

    // Algorithmus kann in Unterklasse geändert werden.
    protected boolean validateAddressAndBankDetais() {
        System.out.println("Adresse und Bankverbindung überprüfen");
        return System.currentTimeMillis() % 2 == 0;
    }

    // Algorithmus kann in Unterklasse geändert werden.
    protected void executeOrder() {
        System.out.println("Bestellung wird ausgeführt");
    }

    // Algorithmus soll nicht geändert werden in der Unterklasse.
    private void pushPointsToPayback() {
        System.out.println("Einkauf wird Payback mitgeteilt (und dadurch Payback-Punkte gutgeschrieben.");
    }

    // Algorithmus/Abfrage muss in Unterklasse implementiert werden.
    abstract boolean isCollectingPaybackPoints();
}
