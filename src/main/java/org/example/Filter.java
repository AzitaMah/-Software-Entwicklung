package org.example;

import java.util.Arrays;

public class Filter {

  public static String[] filterArray(String[] currency, String currencyEingabe) {


    //Wandelt das Array in einen Stream Objekt um.
    //.filter methode filtert alle false Bediengung
    //lambda Ausdruck ist einfach eine verkuerzere Schreibweise fuer s.contains(filter)
    //returned alle gefilterte Objekte in einen Array
    return Arrays.stream(currency).filter(v -> v.contains(currencyEingabe)).toArray(String[]::new);
  }




}
