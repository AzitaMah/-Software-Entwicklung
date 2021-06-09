package org.example;


public class FilterCurrency {


  public static void filter(String[] currency, String eingabe) {

    Filter filter = new Filter();

    String filterTest[] = Filter.filterArray(currency, eingabe);

    int i = 0;
    for (String output : filterTest
    ) {

      System.out.println(i + ": " + output);
      i++;
    }


  }
}
