package org.example;

import java.util.Arrays;

public class Filter {

  public static String[] filterArray(String[] currency, String eingabe) {

    return Arrays.stream(currency).filter(v -> v.contains(eingabe)).toArray(String[]::new);


  }

}
