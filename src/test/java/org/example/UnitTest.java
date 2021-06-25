package org.example;
import org.junit.Assert;
import org.junit.Test;


/**
 * Unit test
 */
public class UnitTest {





  @Test public void test_1_SDR_FilteredData(){
    String[] currency = {"Kuwaiti dinar",
            "Malaysian ringgit",
            "Mauritian rupee",
            "Mexican peso",
            "New Zealand dollar",
            "Norwegian krone",
            "Singapore dollar",
            "Chinese yuan",
            "Swedish krona",
            "South African rand"
    };
    //Test1
    String[]test1=  {"Kuwaiti dinar"};
    String[]test2 = {"New Zealand dollar"};
    String[]test3 = {"Mexican peso"};
    String[]test4 = {"New Zealand dollar","Singapore dollar"};
    String[]test5 = {"South African rand"};
    String[] g1= Filter.filterArray(currency,"Kuwaiti");
    String[] g2= Filter.filterArray(currency,"New Zealand");
    String[] g3= Filter.filterArray(currency,"Mexican");
    String[] g4= Filter.filterArray(currency,"dol");
    String[] g5= Filter.filterArray(currency,"South African rand");



    Assert.assertArrayEquals(test1,g1);  // ottput stimmt nicht überein ?
    System.out.println("Expected: " + test1[0] + "\n" + "Given: " + g1[0]);
    System.out.println();
    Assert.assertArrayEquals(test2,g2);
    System.out.println("Expected: " + test2[0] + "\n" + "Given: " + g2[0]);
    System.out.println();
    Assert.assertArrayEquals(test3,g3);
    System.out.println("Expected: " + test3[0] + "\n" + "Given: " + g3[0]);
    System.out.println();
    Assert.assertArrayEquals(test4,g4);
    System.out.println("Expected: " + test4[0]+", "+test4[1] + "\n" + "Given: " + g4[0]+", "+g4[1]);
    System.out.println();
    Assert.assertArrayEquals(test5,g5);
    System.out.println("Expected: " + test5[0] + "\n" + "Given: " + g5[0]);
    System.out.println();

  }

  @Test public void test_2_StingToDoubel(){
    //"1.029.060";
    //"5,172.720000";
    String one = "1029060";
    String two = "5.172720000";
    String three="765.866678566";
    String d1= Ausführung.prepareDouble("1.029.060");
    String d2= Ausführung.prepareDouble("5,172.720000");
    String d3= Ausführung.prepareDouble("765,866.678.566");

    Assert.assertEquals(one,d1);
    System.out.println("Expected: "+one+"\nGiven:"+d1);
    System.out.println();
    Assert.assertEquals(two,d2);
    System.out.println("Expected: "+two+"\nGiven:"+d2);
    System.out.println();
    Assert.assertEquals(three,d3);
    System.out.println("Expected: "+three+"\nGiven:"+d3);

  }


}
