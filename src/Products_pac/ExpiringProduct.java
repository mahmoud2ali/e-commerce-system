package Products_pac;

import java.time.LocalDate;
public class ExpiringProduct extends Product {

    private LocalDate expiryDate;

    public ExpiringProduct(String name, double price, int quantity, LocalDate expiryDate) {
        super(name, price, quantity);
        this.expiryDate = expiryDate;
    }

    public boolean isExpired()
    {
        return LocalDate.now().isAfter(expiryDate);
    }

    public LocalDate getExpiryDate()
    {
        return this.expiryDate;
    }
}
