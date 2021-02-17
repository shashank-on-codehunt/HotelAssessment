package Entities;

public class Hotel implements Comparable{
    protected int WEEKEND_REGULAR_PRICE;
    protected int WEEKDAY_REGULAR_PRICE;
    protected int WEEKEND_REWARD_PRICE;
    protected int WEEKDAY_REWARD_PRICE;
    protected int charge;
    protected int rating;
    CustomerType customerType;

    Hotel(String customerTypeValue) {
        this.customerType = CustomerType.valueOf(customerTypeValue);
    }

    /**
     * getChargeForDay , calculates the price of hotel as per particular day and customer type
     * @param date contains the date in following format '18 MAY 2021(WED)'
     * @return the charge for the day
     */
    public int getChargeForDay(String date){
        if (customerType.equals(CustomerType.REGULAR)) {
            return (isWeekday(extractDay(date)))?WEEKDAY_REGULAR_PRICE:WEEKEND_REGULAR_PRICE;
        } else if (customerType.equals(CustomerType.REWARD)) {
            return (isWeekday(extractDay(date)))?WEEKDAY_REWARD_PRICE:WEEKEND_REWARD_PRICE;
        }
        return 0;
    }
    /**
     * Helper method to check if its a weekDay or not
     * @param day
     * @return
     */
    private boolean isWeekday(String day) {
        return !day.equals("SAT") && !day.equals("SUN");
    }

    /**
     * Helper method to extract Day value from date format provided
     * @param date date in following format '18 MAY 2021(WED)'
     * @return day value e.g. for '18 MAY 2021(WED)' it would be 'WED'
     */
    private String extractDay(String date) {
        return date.substring(date.length() - 4, date.length() - 1);
    }
    //Getters and Setters
    public int getCharge() {
        return charge;
    }
    public void setCharge(int charge) {
        this.charge = charge;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Object o) {
        int chargeCompare = ((Hotel)o).getCharge()-this.getCharge();
        return chargeCompare!=0?chargeCompare:this.getRating()-((Hotel)o).getRating();
    }
}

/**
 * Enum for Customer Type
 */
enum CustomerType {
    REGULAR,
    REWARD
}

