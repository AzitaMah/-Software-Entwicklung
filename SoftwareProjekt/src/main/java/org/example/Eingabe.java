package org.example;

import java.util.Scanner;

public class Eingabe {

  public void gibAus() {

    Scanner scanner = new Scanner(System.in);
    String toBuy = "not set";
    String toSell = "not set";
    int eingabe;
    String exit = "x";

    //Interface startup
    System.out.println("Currency to buy: " + toBuy);
    System.out.println("Currency to sell: " + toSell);
    System.out.println();
    System.out.println("0: Select currency to buy");
    System.out.println("1: Select currency to sell");
    System.out.println("2: Choose amount to be converted: ");
    System.out.println();
    System.out.println("Please choose an option (>>x<< to exit): ");
    eingabe = scanner.nextInt();

    do {

      //depends on the integer input what class to run next
      if (eingabe == 0) {
        System.out.println("Enter a currency's name or part of it (>>xxx<< to exit): ");
      } else if (eingabe == 1) {
        System.out.println("Enter a currency's name or part of it (>>xxx<< to exit): ");
      } else if (eingabe == 2) {
        System.out.println("Enter an amount (>>xxx<< to exit): ");
      } else {
        System.out.println("Sie haben irgendwas falsch eingegeben.");
      }
      eingabe = scanner.nextInt();


      //while the input is NOT x the loop continues (Integer converted to String, .compareTo gives a positive or a negative number depends
      // on who is lexicographically first
    } while (Integer.toString(eingabe).toLowerCase().compareTo(exit) < 0 || Integer.toString(eingabe).toLowerCase().compareTo(exit) > 0);

  }
}

