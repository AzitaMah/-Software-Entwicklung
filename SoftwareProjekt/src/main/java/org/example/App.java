package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {


  public static void main(String[] args) throws IOException {


    //Scanning the input from the user
    Scanner scanner = new Scanner(System.in);
    //Eingabe.java class
    Eingabe eingabe = new Eingabe();
    ArrayData ray = new ArrayData();

    ray.fillingArray();
    ray.giveString();



    //Interface and InputMismatchException catch
    try {
      eingabe.gibAus();
    } catch (InputMismatchException e) {
      System.out.println("Nur Zahlen eingeben!");
    }


    scanner.close();
  }


}
