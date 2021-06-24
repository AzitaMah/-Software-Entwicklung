import org.example.Filter;
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
                "Norwegian krone"
        };
        //Test1
        String[]test1=  {"Kuwaiti dinar"};
        String[]test2 = {"New Zealand dollar"};
        String[]test3 = {"Mexican peso"};
        String[] g1= Filter.filterArray(currency,"Kuwaiti");
        String[] g2= Filter.filterArray(currency,"New Zealand");
        String[] g3= Filter.filterArray(currency,"Mexican");

        Assert.assertArrayEquals(test1,g1);  // ottput stimmt nicht überein ?
        Assert.assertArrayEquals(test2,g2);
        Assert.assertArrayEquals(test3,g3);
    }

    @Test public void test_2_StingToDoubel(){


    }


    @Test public void test_3_(){
      //  Assert.assertEquals("2368,4",TestArray.filtered);                   // Wie testen wenn filterd sowohl void ist, als auch kein input hat
    }


    /**
    public void testApp() {
        //  Assert.assertEquals( 33, App.add(30, 3));
    }**/
}
