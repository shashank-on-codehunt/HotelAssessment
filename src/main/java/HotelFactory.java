import Entities.Hotel;
import Entities.Oyo;
import Entities.Radisson;
import Entities.Taj;

/*
Factory for generation of Hotel object of a particular type
 */
public class HotelFactory {
    public static Hotel getHotel(HotelName hotelName, String CustomerType) {
        if (hotelName.equals(HotelName.OYO)) {
            return new Oyo(CustomerType);
        } else if (hotelName.equals(HotelName.RADISSON)) {
            return new Radisson(CustomerType);
        }else if (hotelName.equals(HotelName.TAJ)) {
            return new Taj(CustomerType);
        }
        return null;
    }
}
