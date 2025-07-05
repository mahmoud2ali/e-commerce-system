import Products_pac.Cheese;
import Products_pac.MobileScratchCards;
import Products_pac.TV;
import customer.Customer;

import java.time.LocalDate;

public class mainClass {
    public static void main(String[] args)
    {
        Customer customer = new Customer("Mahmoud", 5000.00);

        Cheese cheese = new Cheese("Cheese", 20.0, 5, LocalDate.of(2025, 7, 9), 0.5);
        TV tv = new TV("Samsung", 400, 6, 15 );

        MobileScratchCards scratchCards = new MobileScratchCards("Vodafon Card", 50, 5);


        customer.getCart().add(cheese, 2);
        customer.getCart().add(tv, 2);
        customer.getCart().add(scratchCards, 2);

        customer.checkout();


    }
}
