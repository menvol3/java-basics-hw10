import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleExceptionTest {

    /**
     * Test data for positive test.
     *
     * @return test data array
     */
    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {4, 8, 32},
                {5, 10, 50},
                {2, 2, 4},
                {2, 3, 6}
        };
    }

    /**
     * Test data for exception test.
     *
     * @return test data array
     */
    @DataProvider(name = "negativeData")
    public static Object[][] negativeData() {
        return new Object[][]{
                {-2, 2},
                {2, -2}
                // TODO add 2 more test data here
        };
    }

    @Test(dataProvider = "data")
    public static void testRectangleArea(int a, int b, int c) {
        int area = ExampleException.rectangleArea(a, b);
        assertEquals(area, c, "Area is not correct");
    }


    @Test(dataProvider = "negativeData")
    public void testRectangleAreaNegative(int a, int b) {
        try {
            ExampleException.rectangleArea(a, b);
            fail("No exception thrown!");
        } catch (IllegalArgumentException e) {
        }
    }
}