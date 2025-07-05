package Products_pac;

public class Mobile extends NonExpiringProduct implements ShippapleProduct {
    private double weight;

    public Mobile(String name, double price, int quantity, double weight)
    {
        super(name, price, quantity);
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
