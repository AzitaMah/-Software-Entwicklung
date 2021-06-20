package org.example;

public class Start {

  String toBuy = "not set", toSell = "not set";

  //Getter und Setter fuer Buy und Sell
  public void setToBuy(String toBuy) {
    this.toBuy = toBuy;
  }
  public String getToBuy() {
    return toBuy;
  }

  public void setToSell(String toSell) {
    this.toSell = toSell;
  }
  public String getToSell() {
    return toSell;
  }

  public void startupInterface(int option) {
    String eingabe;
    String exit = "x";

    if(option!=2){
      //Interface startup

      System.out.println("Currency to buy: " + toBuy);
      System.out.println("Currency to buy: " + toSell);

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

  public String toStringEnd(){
    return "\n" + "The program is still running until you enter x" + "\n";
  }



}
