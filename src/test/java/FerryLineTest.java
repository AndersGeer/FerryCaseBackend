import eto.InvalidDataException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

public class FerryLineTest {

    FerryLine ferryLine;
    @Before
    public void Setup()
    {
        ferryLine= new FerryLine("Start", "Ended");
    }
    //Limits was tested in FerryTest
    @Test
    public void SetFerryTest()
    {
        Ferry f = null;
        try {
            f =new Ferry(
                    "ABCDE",
                    "Juleri",
                    false,
                    false,
                    "Start",
                    "Ended",
                    0,
                    0,
                    0,
                    0);
        } catch (InvalidDataException e) {
            fail();
        }

        ferryLine.setFerry(f);

        assertEquals(f,ferryLine.getFerry());
        assertNotEquals(null,ferryLine.getFerry());
    }

    @Test
    public void getFerry()
    {
        Ferry f = null;
        Ferry ferryTest = null;
        try {
            f =new Ferry(
                    "ABCDE",
                    "Juleri",
                    false,
                    false,
                    "Start",
                    "Ended",
                    0,
                    0,
                    0,
                    0);
            ferryTest = new Ferry(
                    "DEFGH",
                    "JulenErKommet",
                    true,
                    true,
                    "Starting",
                    "Ending",
                    17,
                    3,
                    1,
                    9);
        } catch (InvalidDataException e) {
            fail();
        }

        ferryLine.setFerry(f);

        assertNotEquals(null,ferryLine.getFerry());

        assertEquals(f,ferryLine.getFerry());

        assertNotEquals(ferryTest,f);
        assertNotEquals(ferryTest, ferryLine.getFerry());

        ferryLine.setFerry(ferryTest);
        assertNotEquals(null,ferryLine.getFerry());

        assertEquals(ferryTest,ferryLine.getFerry());

        assertNotEquals(ferryTest,f);
        assertNotEquals(f, ferryLine.getFerry());

    }


}
