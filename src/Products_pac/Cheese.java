package Products_pac;

import java.time.LocalDate;

public class Cheese extends ExpiringProduct implements ShippapleProduct {
    private double weight;
    public Cheese(String name, double price, int quantity, LocalDate expiryDate, double weight)
    {
        super(name, price, quantity, expiryDate);
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
