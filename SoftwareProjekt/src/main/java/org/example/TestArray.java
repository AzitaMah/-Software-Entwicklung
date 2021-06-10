package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TestArray {


  //Arrays
  String[] currency = new String[39];
  String[] wert = new String[39];
  static String[] filterTest = new String[39];

  public void arrayfuellen() throws IOException {
    Eingabe eingabe = new Eingabe();

    //path to the .txt file

    //reading only the first line
    BufferedReader br = new BufferedReader(new FileReader("SDR.txt"));


    //Variables for the arrays
    int i = 0;
    int a = 0;
    int x = 0;
    int z = 0;

    //filling the arrays with currency names and SDR-Value
    while (i < 78) {
      if (a % 2 == 0) {
        currency[x] = br.readLine().toUpperCase();
        x++;
      } else {
        wert[z] = br.readLine().toUpperCase();
        z++;
      }
      a++;
      i++;
    }
  }

  public static void filter(String[] currency, String eingabe) {

    Filter filter = new Filter();

     filterTest = Filter.filterArray(currency, eingabe);

    int i = 0;
    for (String output : filterTest
    ) {
      System.out.println(i + ": " + output);
      i++;
    }

  }

    public void filtered() {
      // Persönliches check up. Vor Abgabe Löschen
      Scanner scanner = new Scanner(System.in);
      Start start = new Start();


      String eingabe = scanner.next();

      while (!eingabe.equals("x")) {



        if (eingabe.equals("0")) {

          System.out.println("Please enter the currencys name: ");
         String currencyEingabe = scanner.next().toUpperCase();

          filter(currency, currencyEingabe);

          System.out.println("Select a currency by index: ");
          int eingabeInt = scanner.nextInt();

          start.setToBuy(filterTest[eingabeInt]);
          start.toString();
          start.startupInterface();
          eingabe = "";
        } else if (eingabe.equals("1")) {
          System.out.println("Please enter the currencys name: ");
          String currencyEingabe = scanner.next().toUpperCase();

          filter(currency, currencyEingabe);

          System.out.println("Select a currency by index: ");
          int eingabeInt = scanner.nextInt();

          start.setToSell(filterTest[eingabeInt]);
          start.toString();
          start.startupInterface();
          eingabe = "";
        }else if(eingabe.equals("2")) {

          System.out.println("rechnung fehlt");

        } else {
          System.out.println("quit programm");
        }
      eingabe = scanner.next();


      }
    }



}
