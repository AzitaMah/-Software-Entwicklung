package org.example;

/**
 * <p>Start Klasse mit User Interface.</p>
 */

public class Start {

  /**
   * <p>Das Interface wird ausgegeben.</p>
   *<p>Zu Beginn werden Werte toBuy und toSell auf "not set" gesetzt.</p>
   */


  String toBuy = "not set", toSell = "not set";

  /**
   * @param toBuy <p>Parameter Buy wird gesetzt.</p>
   */

  //Getter und Setter fuer Buy und Sell
  public void setToBuy(String toBuy) {
    this.toBuy = toBuy;
  }

  /**
   * @return Parameter Buy <p>Buy wird zurrück gegeben.</p>
   */
  public String getToBuy() {
    return toBuy;
  }

  /**
   * @param toSell <p> Sell wird gesetzt.</p>
   */
  public void setToSell(String toSell) {
    this.toSell = toSell;
  }

  /**
   * @return Parameter Sell   <p>Paramert Sell wird zurrück gegeben.</p>
   */
  public String getToSell() {
    return toSell;
  }


  /**
   *
   * <p>Start Interface/ Mit getter und Setter hinzufügen der Currencies/End interface.</p>
   *
   * @param option <p>int option gibt die entsprechene Ausgabe für das End Interface an. </p>
   */
  public void startupInterface(int option) {
    String eingabe;
    String exit = "x";

    if(option!=2){
      //Interface startup

      System.out.println("Currency to buy: " + toBuy);
      System.out.println("Currency to sell: " + toSell);

      System.out.println("++++++++++++++++++++++++");
      System.out.println("0: Select currency to buy");
      System.out.println("1: Select currency to sell");
      System.out.println("2: Choose amount to be converted: ");
      System.out.println();
      System.out.println("Please choose an option (>>x<< to exit): ");


    }else{System.out.println(toStringEnd());

      System.out.println("++++++++++++++++++++++");
      System.out.println("0: Select currency to buy");
      System.out.println("1: Select currency to sell");
      System.out.println("2: Choose amount to be converted: ");
      System.out.println();
      System.out.println("Please choose an option (>>x<< to exit): ");}

  }

  /**
   * @return  <p>Gibt aus, dass das Programm noch läuft, bis x eingegeben wird. </p>
   */
  public String toStringEnd(){
    return "\n" +
      "The program is still running until you enter x"
      + "\n";
  }



}
