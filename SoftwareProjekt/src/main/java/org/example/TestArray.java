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

    private double round(double value, int decimalPoints){
    double d =Math.pow(10,decimalPoints);
    return Math.round(value*d)/d;
    }

    private String prepareDouble(String wert){
    StringBuffer buf = new StringBuffer(wert);
    for (int i =0;i<buf.length();i++){
      if(wert.charAt(i)==','){
        buf.setCharAt(i,'.');
      }else if(wert.charAt(i)=='.'){
        buf.deleteCharAt(i);
      }
    }
    String output= buf.toString();
    return output;
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
          start.startupInterface(0);
          eingabe = "";
        } else if (eingabe.equals("1")) {
          System.out.println("Please enter the currencys name: ");
          String currencyEingabe = scanner.next().toUpperCase();

          filter(currency, currencyEingabe);

          System.out.println("Select a currency by index: ");
          int eingabeInt = scanner.nextInt();

          start.setToSell(filterTest[eingabeInt]);
          start.toString();
          start.startupInterface(1);
          eingabe = "";
        }else if(eingabe.equals("2")) {

          System.out.println("Enter an amount:");
          double eingabeD = scanner.nextDouble();
          double ausgabe = round(eingabeD,2);
          String buy ="";
          String sell="";
          String Buy = start.getToBuy();

          for(int i = 0;i<currency.length;i++){
            if(start.getToBuy().equals(currency[i])){
               buy = prepareDouble(wert[i]);
              System.out.println(wert[i]);
            }if(start.getToSell().equals(currency[i])){
              sell= prepareDouble(wert[i]);
            }
          }

          double buyD = round(Double.parseDouble(buy),2);
          double sellD= round(Double.parseDouble(sell),2);
          String setToBuy=start.getToBuy()+": "+ ausgabe;
          start.setToBuy(setToBuy);
          ausgabe= ausgabe / buyD;
          ausgabe *= sellD;
         // System.out.println(ausgabe);
          String setToSell= start.getToSell()+": "+ round(ausgabe,2);
          start.setToSell(setToSell);

          start.toStringEnd();
          start.startupInterface(2);



        } else {
          System.out.println("quit programm");
        }
      eingabe = scanner.next();


      }
    }



}
