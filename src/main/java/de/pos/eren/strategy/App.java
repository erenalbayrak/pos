package de.pos.eren.strategy;

import de.pos.eren.strategy.serverresponses.Response_A;
import de.pos.eren.strategy.serverresponses.Response_B;
import de.pos.eren.strategy.serverresponses.Response_C;

// mvn clean compile exec:java -D"exec.mainClass"="de.pos.eren.strategy.App"
public class App
{
    public static void main( String[] args )
    {
        System.out.print("Response A: ");
        Response_A response_a = new Response_A();
        response_a.compressAndSendResponse();

        System.out.print("Response B: ");
        Response_B response_b = new Response_B();
        response_b.compressAndSendResponse();

        System.out.print("Response C: ");
        Response_C response_c = new Response_C();
        response_c.compressAndSendResponse();
    }
}
