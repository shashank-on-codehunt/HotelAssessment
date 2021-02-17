package Entities;

/**
 * Class Dedicated for Oyo , it updates the Specific values in Hotel class
 */
public class Oyo extends Hotel {
    public Oyo(String customerType) {
        super(customerType);
        WEEKEND_REGULAR_PRICE=90;
        WEEKDAY_REGULAR_PRICE=130;
        WEEKEND_REWARD_PRICE=80;
        WEEKDAY_REWARD_PRICE=90;
        rating=4;
    }
}
