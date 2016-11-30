import eto.InvalidDataException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

public class FerryConfigTest
{
    FerryConfig ferryConfig;
    @Before
    public void Setup()
    {
        try {
            ferryConfig = new FerryConfig(1,2,3,4);
        } catch (InvalidDataException e) {
            fail();
        }
    }

    @Test
    public void testGetters()
    {
        int personLimitTest = 1;int carLimitTest = 2; int lorryLimitTest = 3; int machienLimitTest = 4;
        assertEquals(personLimitTest, ferryConfig.getPersonLimit());
        assertEquals(carLimitTest,ferryConfig.getCarLimit());
        assertEquals(lorryLimitTest,ferryConfig.getLorryLimit());
        assertEquals(machienLimitTest, ferryConfig.getMachineLimit());
        try{
            ferryConfig = new FerryConfig(4,3,2,1);
        }
        catch (InvalidDataException e) {
            fail();
        }
        assertNotEquals(personLimitTest,ferryConfig.getPersonLimit());
        assertNotEquals(carLimitTest,ferryConfig.getCarLimit());
        assertNotEquals(lorryLimitTest,ferryConfig.getLorryLimit());
        assertNotEquals(machienLimitTest, ferryConfig.getMachineLimit());
        personLimitTest = 4;carLimitTest = 3;lorryLimitTest = 2;machienLimitTest = 1;
        assertEquals(personLimitTest, ferryConfig.getPersonLimit());
        assertEquals(carLimitTest,ferryConfig.getCarLimit());
        assertEquals(lorryLimitTest,ferryConfig.getLorryLimit());
        assertEquals(machienLimitTest, ferryConfig.getMachineLimit());
    }
}
