package de.pos.eren.template;

public class HandleOrdersFromSmartphone extends Order
{
    @Override
    void parseSelectedArticles() {
        System.out.println("Parse mit xml");
    }

    @Override
    boolean isCollectingPaybackPoints(){
        return System.currentTimeMillis() % 2 == 0;
    }
}
