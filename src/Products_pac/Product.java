package Products_pac;

public abstract class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName()
    {
        return  this.name;
    }
    public double getPrice()
    {
        return this.price;
    }
    public int getQuantity()
    {
        return this.quantity;
    }

    public void reduceQuantity(int amount)
    {
        if(amount < quantity)
        {
            quantity -= amount;
        }
    }


    public abstract boolean isExpired();

}
