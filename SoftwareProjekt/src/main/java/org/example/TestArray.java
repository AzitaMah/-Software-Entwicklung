package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestArray {

  //Arrays
  String[] currency = new String[39];
  String[] wert = new String[39];

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
        currency[x] = br.readLine();
        x++;
      } else {
        wert[z] = br.readLine();
        z++;
      }
      a++;
      i++;
    }
  }

  public void giveString() {

    // Persönliches check up. Vor Abgabe Löschen
    Scanner scanner = new Scanner(System.in);


    String eingabe = scanner.next();


    if (eingabe.equals("0")) {

      System.out.println("Please enter the currencys name: ");
      eingabe = scanner.next();

      FilterCurrency.filter(currency, eingabe);


    }

  }


}
