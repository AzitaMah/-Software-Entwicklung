package org.example;

import java.io.IOException;


public class App {


  public static void main(String[] args) throws IOException {


    //Eingabe.java class
    Eingabe eingabe = new Eingabe();
    TestArray arrayausgabe = new TestArray();
    Start startui = new Start();

    startui.startupInterface(0);
    arrayausgabe.arrayfuellen();
    arrayausgabe.filtered();
    System.out.println();




  }
}
