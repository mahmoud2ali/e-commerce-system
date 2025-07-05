package cart_pac;

import Products_pac.Product;

public class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity)
    {
        if(this.quantity > product.getQuantity())
        {
            System.out.println("quantity exceeds the stock");
            return;
        }
        this.product = product;
        this.quantity = quantity;

    }

    public double getSubTotal()
    {
        return quantity * product.getPrice();
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
