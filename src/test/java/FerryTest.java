
import eto.FerryNotFoundException;
import eto.InvalidDataException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.fail;


public class FerryTest
{



    private Ferry ferry;
    @Before
    public void Setup()  {
        try {
            ferry = new Ferry(
                    "ABCDE",
                    "Juler'n",
                    false,
                    false,
                    "Start",
                    "Ended",
                    0,
                    0,
                    0,
                    0);
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void TestConstructor()
    {
        try {
            ferry = new Ferry(
                    "ABCDE",
                    "Juler'n",
                    false,
                    false,
                    "Start",
                    "Ended",
                    0,
                    0,
                    0,
                    0);
        } catch (InvalidDataException e) {

        }
    }
    @Test
    public void TooShortSerial() {
       try {
        ferry = new Ferry(
                "ABCD",
                "Juler'n",
                false,
                false,
                "Start",
                "Ended",
                0,
                0,
                0,
                0);

            fail();
        } catch (InvalidDataException e) {

        }

    }

    @Test
    public void TooLongSerial() {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    false,
                    false,
                    "Start",
                    "Ended",
                    0,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }


    }

    @Test
    public void NullSerial()  {
        try {
            ferry = new Ferry(
                    null,
                    "Juler'n",
                    false,
                    false,
                    "Start",
                    "End",
                    0,
                    0,
                    0,
                    0
            );
            fail();
        } catch (InvalidDataException e) {

        }

    }

    @Test
    public void NullName()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    null,
                    false,
                    false,
                    "Start",
                    "Ended",
                    0,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }

    }
    @Test
    public void EmptyName()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "",
                    false,
                    false,
                    "Start",
                    "Ended",
                    0,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }

    }

    @Test
    public void WhitespaceName()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "       ",
                    false,
                    false,
                    "Start",
                    "Ended",
                    0,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }

    }


    @Test
    public void dockedStateTrue()  {

        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Start",
                    "Ended",
                    0,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void dockedStateFalse()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    false,
                    false,
                    "Start",
                    "Ended",
                    0,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }

    }

    @Test
    public void lentStateTrue()  {

        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    false,
                    true,
                    "Start",
                    "Ended",
                    0,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }

    }

    @Test
    public void lentStateFalse()  {

        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    false,
                    false,
                    "Start",
                    "Ended",
                    0,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }

    }

    @Test
    public void StartDestinationNull()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    null,
                    "Ended",
                    0,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void StartDestinationEmpty()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "",
                    "Ended",
                    0,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void StartDestinationWhitespace()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "     ",
                    "Ended",
                    0,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void StartDestination3Letters()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Sta",
                    "Ended",
                    0,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void StartDestination4Letters()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Star",
                    "Ended",
                    0,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void EndDestinationNull()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Start",
                    null,
                    0,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void EndDestinationEmpty()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Start",
                    "",
                    0,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void EndDestinationWhitespace()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Start",
                    "     ",
                    0,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void EndDestination3Letters()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Start",
                    "End",
                    0,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void EndDestination4Letters()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Start",
                    "Ende",
                    0,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void PersonLimitNegative()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Start",
                    "Ended",
                    -1,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void personLimitIntMaxPlusOne()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Start",
                    "Ende",
                    Integer.MAX_VALUE+1,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void personLimitIntMax()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Start",
                    "Ende",
                    Integer.MAX_VALUE,
                    0,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void carLimitNegative()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Start",
                    "Ended",
                    0,
                    -1,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void carLimitIntMaxPlusOne()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Start",
                    "Ende",
                    0,
                    Integer.MAX_VALUE+1,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void carLimitIntMax()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Start",
                    "Ende",
                    0,
                    Integer.MAX_VALUE,
                    0,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void lorryLimitNegative()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Start",
                    "Ended",
                    0,
                    0,
                    -1,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void machineLimitNegative()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Start",
                    "Ended",
                    0,
                    0,
                    0,
                    -1);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void machineLimitIntMaxPlusOne()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Start",
                    "Ende",
                    0,
                    0,
                    0,
                    Integer.MAX_VALUE+1);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void machineLimitIntMax()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Start",
                    "Ende",
                    0,
                    0,
                    0,
                    Integer.MAX_VALUE);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void lorryLimitIntMaxPlusOne()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Start",
                    "Ende",
                    0,
                    0,
                    Integer.MAX_VALUE+1,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void lorryLimitIntMax()  {
        try {
            ferry = new Ferry(
                    "ABCDEF",
                    "Juler'n",
                    true,
                    false,
                    "Start",
                    "Ende",
                    0,
                    0,
                    Integer.MAX_VALUE,
                    0);
            fail();
        } catch (InvalidDataException e) {

        }
    }

    @Test
    public void testSerialGetter()
    {

        String serialTest = "ABCDE";
        Assert.assertTrue(serialTest.equals(ferry.getSerialNumber()));
        try {
            ferry = new Ferry(
                    "BCDEF",
                    "Juler'n",
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
        Assert.assertTrue(!serialTest.equals(ferry.getSerialNumber()));
        serialTest = "BCDEF";
        Assert.assertTrue(serialTest.equals(ferry.getSerialNumber()));

    }

    @Test
    public void testNameGetter()
    {

        String nameTest = "Juler'n";
        Assert.assertEquals(nameTest, (ferry.getName()));
        try {
            ferry = new Ferry(
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
        Assert.assertTrue(!nameTest.equals(ferry.getName()));
        nameTest = "Juleri";
        Assert.assertTrue(nameTest.equals(ferry.getName()));
    }

    @Test
    public void testDockedGetter()
    {

        boolean stateTest = false;
        Assert.assertTrue(stateTest == (ferry.isDockedState()));
        try {
            ferry = new Ferry(
                    "ABCDE",
                    "Juleri",
                    true,
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
        Assert.assertTrue(stateTest != (ferry.isDockedState()));
        stateTest = true;
        Assert.assertTrue(stateTest == (ferry.isDockedState()));
    }

    @Test
    public void testLentGetter()
    {

        boolean stateTest = false;
        Assert.assertTrue(stateTest == (ferry.isLentState()));
        try {
            ferry = new Ferry(
                    "ABCDE",
                    "Juleri",
                    false,
                    true,
                    "Start",
                    "Ended",
                    0,
                    0,
                    0,
                    0);
        } catch (InvalidDataException e) {
            fail();
        }
        Assert.assertTrue(stateTest != (ferry.isLentState()));
        stateTest = true;
        Assert.assertTrue(stateTest == (ferry.isLentState()));
    }

    @Test
    public void testStartDestGetter()
    {

        String StartDestTest = "Start";
        try {
            Assert.assertTrue(StartDestTest.equals(ferry.getFerryLine("Start","Ended").getStartDestination()));
        } catch (FerryNotFoundException e) {
            fail("FerryNotFoundException Thrown");
        }
        try {
            ferry = new Ferry(
                    "ABCDE",
                    "Juleri",
                    false,
                    false,
                    "Starting",
                    "Ended",
                    0,
                    0,
                    0,
                    0);
        } catch (InvalidDataException e) {
           fail();
        }
        try {
            Assert.assertFalse(StartDestTest.equals((ferry.getFerryLine("Starting","Ended").getStartDestination())));
        } catch (FerryNotFoundException e) {
            fail("FerryNotFoundException Thrown");
        }
        StartDestTest = "Starting";
        try {
            Assert.assertTrue(StartDestTest.equals(ferry.getFerryLine("Starting","Ended").getStartDestination()));
        } catch (FerryNotFoundException e) {
            fail("FerryNotFoundException Thrown");
        }
    }

    public void testEndDestGetter()
    {

        String EndDestTest = "Ended";
        try {
            Assert.assertTrue(EndDestTest.equals(ferry.getFerryLine("Start","Ended").getEndDestination()));
        } catch (FerryNotFoundException e) {
            fail("FerryNotFoundException Thrown");
        }
        try {
            ferry = new Ferry(
                    "ABCDE",
                    "Juleri",
                    false,
                    false,
                    "Start",
                    "Ending",
                    0,
                    0,
                    0,
                    0);
        } catch (InvalidDataException e) {
            fail();
        }
        try {
            Assert.assertTrue(EndDestTest.equals(ferry.getFerryLine("Start","Ending").getEndDestination()));
        } catch (FerryNotFoundException e) {
            fail("FerryNotFoundException Thrown");
        }
        EndDestTest = "Starting";
        try {
            Assert.assertTrue(EndDestTest.equals(ferry.getFerryLine("Start","Ending").getEndDestination()));
        } catch (FerryNotFoundException e) {
            fail("FerryNotFoundException Thrown");
        }
    }
}
