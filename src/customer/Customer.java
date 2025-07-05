package customer;

import Products_pac.Product;
import Products_pac.ShippapleProduct;
import cart_pac.Cart;
import cart_pac.CartItem;
import services.ShippingService;

import java.util.ArrayList;

public class Customer {
    private double balance;
    private String name;
    private Cart cart;

    public Customer(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
        cart = new Cart();
    }

    public Cart getCart() {
        return cart;
    }

    public double getBalance() {
        return balance;
    }

    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty !");
            return;
        }

        for (CartItem item : cart.getItems()) {
            Product product = item.getProduct();

            if (product.isExpired()) {
                System.out.println("product is Expired");
                System.out.println(product.getName());
                return;
            }
            if (product.getQuantity() < item.getQuantity()) {
                System.out.println("Item is out of stock");
                System.out.println(product.getName());
                return;
            }

        }

        double subTotal = cart.getSubTotal();
        double shippingFees = cart.getShippableItems().size() * 0.3;
        double total = subTotal + shippingFees;

        if (total > balance) {
            System.out.println("balance problem");
            return;
        }

        for (CartItem item : cart.getItems()) {
            item.getProduct().reduceQuantity(item.getQuantity());
        }
        balance -= total;


        ArrayList<ShippapleProduct> shippingItems = cart.getShippableItems();
        if (!shippingItems.isEmpty()) {
            ShippingService shipping = new ShippingService();
            shipping.ship(shippingItems);
        }




        System.out.println("** Checkout receipt **");

        for(CartItem item: cart.getItems())
        {
            System.out.printf("%d X  %s %.2f\n",item.getQuantity(), item.getProduct().getName(), item.getSubTotal());
        }
        System.out.println("----------------------");
        System.out.printf("subtotal %s \n" ,subTotal);
        System.out.printf("Shipping %.2f\n",shippingFees);
        System.out.printf("Amount %.2f\n", total);
//        System.out.println(balance);

        cart.getItems().clear();
    }

}
