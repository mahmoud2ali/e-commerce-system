package Products_pac;

public class NonExpiringProduct extends Product{

    public NonExpiringProduct(String name, double price, int quantity) {
        super(name, price, quantity);
    }
    public boolean isExpired(){
        return false;
    }
}
