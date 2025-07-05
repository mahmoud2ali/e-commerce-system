package Products_pac;

public class TV extends NonExpiringProduct implements ShippapleProduct {

    private double weight;
    public TV(String name, double price, int quantity, double weight)
    {
        super(name, price, quantity);
        this.weight = weight;
    }

    public double getWeight()
    {
        return weight;
    }
}
