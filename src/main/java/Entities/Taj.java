package Entities;

/**
 * Class Dedicated for Taj , it updates the Specific values in Hotel class
 */
public class Taj extends Hotel {
    public Taj(String customerType) {
        super(customerType);
        WEEKEND_REGULAR_PRICE=110;
        WEEKDAY_REGULAR_PRICE=120;
        WEEKEND_REWARD_PRICE=95;
        WEEKDAY_REWARD_PRICE=105;
        rating=2;
    }
}
