package de.pos.eren.template.execute;

import de.pos.eren.template.HandleOrdersFromDesktop;
import de.pos.eren.template.HandleOrdersFromSmartphone;

// mvn clean compile exec:java -D"exec.mainClass"="de.pos.eren.template.execute.Main"
public class Main
{
    public static void main( String[] args )
    {
        HandleOrdersFromDesktop desktopOrderHandler = new HandleOrdersFromDesktop();
        desktopOrderHandler.doOrder();

        HandleOrdersFromSmartphone smartphoneOrderHandler = new HandleOrdersFromSmartphone();
        smartphoneOrderHandler.doOrder();
    }
}
