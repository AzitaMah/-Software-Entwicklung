package org.example;

import java.io.IOException;


public class App {


  //Main
  public static void main(String[] args) throws IOException {

    Ausführung arrayausgabe = new Ausführung();
    Start startui = new Start();

    //startUI
    startui.startupInterface(0);
    arrayausgabe.arrayfuellen();
    arrayausgabe.filtered();
    System.out.println();




  }
}
