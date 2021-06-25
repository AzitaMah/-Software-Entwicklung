package org.example;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * <p>Klasse, die die hauptsächliche Selektier und Rechenlogik enthält.</p>
 */

public class Ausführung {


  //Arrays
  String[] currency = new String[39];
  String[] wert = new String[39];

  static String[] filterTest = new String[39];

  /**
   * <p>Name und Wert werden jeweils in ein Array gefüllt.</p>
   * @throws IOException <p>Exeption für den Fall, dass SDR Datei nicht gefunden wird.</p>
   */

  //Name und Wert werden jeweils in ein Array gefuellt
  public void arrayfuellen() throws IOException {


    //path to the .txt file

    //reading only the first line
    InputStream is = getClass().getResourceAsStream("SDR.txt");
    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);


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

  /**
   * <p>Hier wird die FilterMethode mit dem Index implementiert.</p>
   * @param currency <p>Currency Array wird mitgegeben um zu filtern.</p>
   * @param eingabe <p>Eingabeparameter um danach im Currency-Array zu filtern.</p>
   */

  //hier wird die filter methode implementiert
  private static void filter(String[] currency, String eingabe) {

    Ausführung arrayausgabe = new Ausführung();
    Start startui = new Start();

    Filter filter = new Filter();

    filterTest = Filter.filterArray(currency, eingabe);

  //Test ob Filter Klasse etwas ausgibt
    if(filterTest.length==0){
      System.out.println("Currency not found");
    }else{
      int i = 0;
      for (String output : filterTest
      ) {
        System.out.println(i + ": " + output);
        i++;
      }
    }

  }

  /**
   * <p>Zum richtigen Runden der Ausgabe. </p>
   * @param value <p>Gibt den zu rundenden Wert an.</p>
   * @param decimalPoints <p>Sagt, um wie viele Werte gerundet werden soll.</p>
   * @return <p>Gibt den entsprechend grundeten Wert zurrück.</p>
   */
  //Werte werden gerundet
  private double round(double value, int decimalPoints) {
    double d = Math.pow(10, decimalPoints);
    return Math.round(value * d) / d;
  }

  /**
   *
   * @param wert <p>Ist der Mitgegebene String des Currency-Wertes, für die Anpassung an einen geeigneten double Wert.</p>
   * @return <p>Gibt den für Java vorbereiteten double als String zurrück. </p>
   */
  //Werte werden zu einem double
  public static String prepareDouble(String wert) {
    StringBuffer buf = new StringBuffer(wert);
    for (int i = 0; i < buf.length(); i++) {
      if (buf.charAt(i) == ',') {
        buf.setCharAt(i, '.');
      } else if (buf.charAt(i) == '.') {
        buf.deleteCharAt(i);
      }
    }

    String output = buf.toString();
    return output;
  }

  /**
   * <p>Methode mit eigentlicher Selktier- und Rechenlogik.</p>
   * @throws IOException <p>Eingabe wird geprüft und dementschprechen wird das Program weitergefuehrt. Zusätzlich sind da die Catch-Methoden implementiert.</p>
   */
  //Eingabe wird geprueft und dementschprechen wird das Program weitergefuehrt. Zusaetzlich sind da die Exceptions implementiert.
  public void filtered() throws IOException {
    // Persönliches check up. Vor Abgabe Löschen
    Scanner scanner = new Scanner(System.in);
    Start start = new Start();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



    String eingabe = scanner.next();
    String buy = "";
    String sell = "";
    while (!eingabe.equals("x")) {

      try {


        if (eingabe.equals("0")) {

          System.out.println("Please enter the currencys name: ");
          String currencyEingabe = reader.readLine().toUpperCase();

          filter(currency, currencyEingabe);

          System.out.println("Select a currency by index: ");
          int eingabeInt = scanner.nextInt();

          start.setToBuy(filterTest[eingabeInt]);
          start.toString();
          start.startupInterface(0);
          eingabe = "";

        } else if (eingabe.equals("1")) {

          System.out.println("Please enter the currencys name: ");
          String currencyEingabe = reader.readLine().toUpperCase();

          filter(currency, currencyEingabe);

          System.out.println("Select a currency by index: ");
          int eingabeInt = scanner.nextInt();


          start.setToSell(filterTest[eingabeInt]);
          start.toString();
          start.startupInterface(1);
          eingabe = "";

        } else if (eingabe.equals("2")) {

          System.out.println("Enter an amount:");
          double eingabeD = scanner.nextDouble();
          double ausgabe = round(eingabeD, 2);


          for (int i = 0; i < currency.length; i++) {
            if (start.getToBuy().equals(currency[i])) {
              buy = prepareDouble(wert[i]);
            }
            if (start.getToSell().equals(currency[i])) {
              sell = prepareDouble(wert[i]);
            }
          }

          double buyD = round(Double.parseDouble(buy), 2);
          double sellD = round(Double.parseDouble(sell), 2);
          String setToBuy = start.getToBuy() + ": " + ausgabe;
          ausgabe = ausgabe / buyD;
          ausgabe *= sellD;
          // System.out.println(ausgabe);
          String setToSell = start.getToSell() + ": " + round(ausgabe, 2);


          System.out.println("Currency to buy " + setToBuy);
          System.out.println("Currency to sell " + setToSell);
          start.startupInterface(2);

        }
      }
      catch (InputMismatchException e) {
        System.out.println("Please enter only the latin alphabet and please enter a number as follows: 123,00");
        System.out.println();
        start.startupInterface(0);

      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Please enter only the given index");
        System.out.println();
        start.startupInterface(0);

      } catch (NumberFormatException e) {
        System.out.println("Please enter 2 currencies, one to sell and one to buy");
        System.out.println();
        start.startupInterface(0);

      }


      eingabe = scanner.next();



    }
    //Beenden des Scanners nach Eingebe von x
    scanner.close();
  }


}
