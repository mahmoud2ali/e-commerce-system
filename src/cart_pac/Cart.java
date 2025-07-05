package cart_pac;

import Products_pac.Product;
import Products_pac.ShippapleProduct;

import java.util.ArrayList;

public class Cart {
    ArrayList<CartItem> items = new ArrayList<>();


    public void add(Product product, int quantity)
    {
        if(quantity == 0)
        {
            System.out.println("Can't add 0 item");
            return;
        }
        if(quantity > product.getQuantity())
        {
            System.out.println("quantity exceeds the stock");
            return;
        }
        items.add(new CartItem(product, quantity));
    }

    public boolean isEmpty()
    {
        return items.isEmpty();
    }

    public ArrayList<CartItem> getItems(){
        return items;
    }

    public double getSubTotal()
    {
        double subTotal = 0.0;

        for(CartItem item: items)
        {
            subTotal+= item.getSubTotal();
        }

        return subTotal;
    }

    public ArrayList<ShippapleProduct> getShippableItems()
    {
        ArrayList<ShippapleProduct> shippableItems = new ArrayList<>();
        for(CartItem item: items)
        {
            if(item.getProduct() instanceof ShippapleProduct shippable)
            {
                for(int i = 0 ; i < item.getQuantity(); i++)
                {
                    shippableItems.add(shippable);
                }
            }
        }
        return shippableItems;
    }
}
