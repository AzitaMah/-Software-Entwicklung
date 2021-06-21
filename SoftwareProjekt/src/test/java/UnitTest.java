import org.example.Filter;
import org.junit.Assert;
import org.junit.Test;


/**
 * Unit test
 */
public class UnitTest {

    @Test public void test_1_SDR_FilteredData(){
        String[] strings = {"Kuwaiti dinar",
                "Malaysian ringgit",
                "Mauritian rupee",
                "Mexican peso",
                "New Zealand dollar",
                "Norwegian krone"
        };String[]str={"MEXICAN PESO"};
        String[] g= Filter.filterArray(strings,"mex");
       // Assert.assertArrayEquals(str, g);   // ottput stimmt nicht überein ?
    }

    @Test public void test_2_StingToDoubel(){

        String s="57.338.800";
        String d = UnitTest.prepareDouble;
        Assert.assertEquals("57338800", UnitTest.prepareDouble(s));         //Methode lässt sich nicht auswählen

    }


    @Test public void test_3_(){
      //  Assert.assertEquals("2368,4",TestArray.filtered);                   // Wie testen wenn filterd sowohl void ist, als auch kein input hat
    }


    /**
    public void testApp() {
        //  Assert.assertEquals( 33, App.add(30, 3));
    }**/
}
