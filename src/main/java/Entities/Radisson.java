package Entities;
/**
 * Class Dedicated for Radisson , it updates the Specific values in Hotel class
 */
public class Radisson extends Hotel {
    public Radisson(String customerType) {
        super(customerType);
        WEEKEND_REGULAR_PRICE=100;
        WEEKDAY_REGULAR_PRICE=110;
        WEEKEND_REWARD_PRICE=90;
        WEEKDAY_REWARD_PRICE=100;
        rating=3;
    }
}
