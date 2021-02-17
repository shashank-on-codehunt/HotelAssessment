package Entities;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class HotelTest {

    @Test
    public void testGetChargeForDay() {
        Hotel hotel = new Oyo(CustomerType.REGULAR.toString());
        Assert.assertEquals(130,hotel.getChargeForDay("19 MAY 2021(THU)"));
    }

}