package org.example;

import java.util.Arrays;

/**
 * <p>Filterklasse für Currency Selektion. Gibt gefilterten Array zürrück mit übereinstimmenden Currencies.</p>
 */

public class Filter {

  /**
   * <p>Gibt einen gefilterten currency Array aus.</p>
   *
   * <br>
   *  <ul>
   *           <li>currencyEingabe ="dol";</li>
   *           <li>{"New Zealand dollar","Singapore dollar"}</li>
   *      </ul>
   *
   * @param currency <p>Array der mitgegeben wird.</p>
   * @param currencyEingabe <p>Parameter nachdem gefiltert wird.</p>
   * @return <p>Gibt gefilterten Array zurrück.</p>
   *
   */

  public static String[] filterArray(String[] currency, String currencyEingabe) {


    //Wandelt das Array in einen Stream Objekt um.
    //.filter methode filtert alle false Bediengung
    //lambda Ausdruck ist einfach eine verkuerzere Schreibweise fuer s.contains(filter)
    //returned alle gefilterte Objekte in einen Array
    return Arrays.stream(currency).filter(v -> v.contains(currencyEingabe)).toArray(String[]::new);
  }




}
