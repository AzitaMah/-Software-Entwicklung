package org.example;

import java.io.IOException;


public class Eingabe {

  public void gibAus() throws IOException {

    TestArray arrayfull = new TestArray();

    String toBuy = "not set";
    String toSell = "not set";
    String exit = "x";


    arrayfull.arrayfuellen();


    //Interface startup
    System.out.println("Currency to buy: " + toBuy);
    System.out.println("Currency to sell: " + toSell);
    System.out.println();
    System.out.println("0: Select currency to buy");
    System.out.println("1: Select currency to sell");
    System.out.println("2: Choose amount to be converted: ");
    System.out.println();
    System.out.println("Please choose an option (>>x<< to exit): ");


  }

}

