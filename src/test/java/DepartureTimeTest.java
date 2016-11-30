import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.DateTimeException;
import java.time.LocalTime;


public class DepartureTimeTest
{
    private DepartureTime departureTime;
    
    @Before
    public void Setup()
    {
        departureTime = new DepartureTime(10,30);
    }

    @Test(expected=DateTimeException.class)
    public void testCreateNegativeHour()
    {
        departureTime = new DepartureTime(-1, 0);
    }
    @Test(expected=DateTimeException.class)
    public void testCreateNegativeMin()
    {
        departureTime = new DepartureTime(0, -1);
    }

    @Test(expected=DateTimeException.class)
    public void testCreate25Hour()
    {
        departureTime = new DepartureTime(25, 0);
    }

    @Test(expected=DateTimeException.class)
    public void testCreate61Min()
    {
        departureTime = new DepartureTime(0, 61);
    }

    @Test(expected=DateTimeException.class)
    public void testCreate24Hour1Min()
    {
        departureTime = new DepartureTime(24, 1);
    }

    @Test
    public void testCreateMidnightDepart()
    {
        departureTime = new DepartureTime(0, 0);
    }

    @Test(expected=DateTimeException.class)
    public void testCreateMidnightDepart2()
    {
        //Not allowed. Goes from 00:00 to 23:59
        departureTime = new DepartureTime(24, 0);
    }

    @Test
    public void testCreate2359Depart()
    {
        departureTime = new DepartureTime(23, 59);
    }

    @Test
    public void testGetter()
    {
        LocalTime depTest = LocalTime.of(10,30);
        Assert.assertTrue(depTest.equals(departureTime.getDepartureTime()));
        departureTime = new DepartureTime(11,30);
        Assert.assertTrue(!depTest.equals(departureTime.getDepartureTime()));
        depTest = LocalTime.of(11,30);
        Assert.assertTrue(depTest.equals(departureTime.getDepartureTime()));
    }

}
