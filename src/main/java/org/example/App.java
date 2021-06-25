package org.example;

import java.io.IOException;

/**
 * <p>Aufuehrene Klasse App. Methoden</p>
 */
public class App {

  /**
   *
   * @param args <p>Public static void main um Methoden auszuführen</p>
   * @throws IOException <p>Exeption für den Fall das etwas nicht funktioniert</p>
   */
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
