package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * A simple http://logging.apache.org/log4j/2.x demo,
 * see file resources/log4j2.xml for configuration options
 * and A1.log containing debugging output.
 */

public class App {
  private static Logger log = LogManager.getLogger(App.class);

  /**
   * Your application's main entry point.
   *
   * @param args Yet unused
   */
  public static void main(String[] args) throws IOException {

    //path to the .txt file
    FileReader fr = new FileReader("C:\\Users\\dango\\IdeaProjects\\software-entwicklung\\SoftwareProjekt\\src\\main\\java\\org\\example\\SDR.txt");
    //reading only the first line
    BufferedReader br = new BufferedReader(fr);
    //Scanning the input from the user
    Scanner scanner = new Scanner(System.in);
    //Eingabe.java class
    Eingabe eingabe = new Eingabe();

    //Arrays
    String[] currency = new String[39];
    String[] wert = new String[39];

    //Variables for the arrays
    int i = 0;
    int a = 0;
    int x = 0;
    int z = 0;

    //filling the arrays with currency names and SDR-Value
    while (i < 78) {
      if (a % 2 == 0) {
        currency[x] = br.readLine();
        System.out.println(currency[x]);
        x++;
      } else {
        wert[z] = br.readLine();
        System.out.println(wert[z]);
        z++;
      }
      a++;
      i++;
    }


    //Interface and InputMismatchException catch
try{
  eingabe.gibAus();
} catch (InputMismatchException e) {
  System.out.println("Nur Zahlen eingeben!");
}



  }


}
