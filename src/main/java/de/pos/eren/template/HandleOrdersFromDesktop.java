package de.pos.eren.template;

public class HandleOrdersFromDesktop extends Order {

    @Override
    void parseSelectedArticles() {
        System.out.println("Parse mit json");
    }

    @Override
    boolean isCollectingPaybackPoints(){
        return System.currentTimeMillis() % 2 == 0;
    }
}
