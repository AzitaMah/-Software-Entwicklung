package org.example;

import java.util.Arrays;

public class Filter {

  public static String[] filterArray(String[] currency, String currencyEingabe) {

    return Arrays.stream(currency).filter(v -> v.contains(currencyEingabe)).toArray(String[]::new);
  }




}
