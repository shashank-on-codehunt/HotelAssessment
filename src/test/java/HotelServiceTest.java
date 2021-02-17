import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class HotelServiceTest {
    String inputValue;
    HotelName outputResult;

    public HotelServiceTest(String inputValue, HotelName outputResult) {
        this.inputValue = inputValue;
        this.outputResult = outputResult;
    }

    @Parameterized.Parameters
    public static Collection hotelPlans() {
        return Arrays.asList(new Object[][] {
                { "REWARD,19 MAY 2021(THU),20 MAY 2021(FRI),21 MAY 2021(SAT),22 MAY 2021(SUN)", HotelName.OYO },
                { "REGULAR,18 MAY 2021(WED),19 MAY 2021(THU),21 MAY 2021(SAT)", HotelName.RADISSON }
        });
    }
    @Test
    public void testCalculateBestHotelForPricenRating() {
        Assert.assertEquals(outputResult, new HotelService().calculateBestHotelForPricenRating(inputValue));
    }
}