package org.example;

public class Start {

  String toBuy = "not set", toSell = "not set";

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
      System.out.println(toString());
    }else{System.out.println(toStringEnd());}

    //Interface startup
    System.out.println();
    System.out.println("0: Select currency to buy");
    System.out.println("1: Select currency to sell");
    System.out.println("2: Choose amount to be converted: ");
    System.out.println();
    System.out.println("Please choose an option (>>x<< to exit): ");


  }
  @Override
  public String toString() {
    return "Currency to buy: " + getToBuy() + "\n" +
      "Currency to sell: " + getToSell();
  }
  public String toStringEnd(){
    return "Buying " +getToBuy() +"\n"+
            "Selling "+getToSell();
  }


}
