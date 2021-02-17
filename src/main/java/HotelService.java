import Entities.Hotel;

import java.util.HashMap;
import java.util.Map;

public class HotelService {
    /**
     * Caculate the best choice from the list of Hotel
     * as per Requirement
     * @param input provide the comma separated value of input of CustomerType and subsequest dates
     * @return HotelName that the customer should choose
     */
    public HotelName calculateBestHotelForPricenRating(String input) {
        String values[] = input.split(",");
        HashMap<HotelName, Hotel> hotelMap = new HashMap();
        for (HotelName hotelName : HotelName.values()) {
            hotelMap.put(hotelName, evaluateCharge(hotelName, values));
        }

        Map.Entry<HotelName,Hotel> min = null;
        for (Map.Entry<HotelName,Hotel> entry : hotelMap.entrySet()) {
            if (min == null || min.getValue().compareTo(entry.getValue()) < 0) {
                min = entry;
            }
        }
//        System.out.println("Hotel Name: "+min.getKey() +", Charge: $"+min.getValue().getCharge());
        return min.getKey();
    }

    /**
     * Evaluates the charge of the hotel
     * @param hotelName provide the hotelName
     * @param values provide the data in array , with first element as CustomerType
     * @return Hotel object containing value of total charge
     */
    private Hotel evaluateCharge(HotelName hotelName, String[] values) {
        Hotel hotel = HotelFactory.getHotel(hotelName, values[0]);
        int totalCharge=0;
        for(int i= 1; i < values.length; i++) {
            totalCharge += hotel.getChargeForDay(values[i]);
        }
        hotel.setCharge(totalCharge);
        return hotel;
    }
}
