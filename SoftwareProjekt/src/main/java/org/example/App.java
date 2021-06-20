package org.example;

import java.io.IOException;


public class App {


  public static void main(String[] args) throws IOException {

    TestArray arrayausgabe = new TestArray();
    Start startui = new Start();

    //startUI
    startui.startupInterface(0);
    arrayausgabe.arrayfuellen();
    arrayausgabe.filtered();
    System.out.println();




  }
}
