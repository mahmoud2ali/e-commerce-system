# Java E-Commerce Checkout System

This is a Java-based console application that simulates a simple e-commerce system with support for product types, customer cart management, checkout validation, and shipping operations.

---

## Features

- **Product Management**:
  - Define products with name, price, quantity, and weight.
  - Support for **expiring** products (e.g., cheese, biscuits).
  - Support for **shippable** products with individual weights.
- **Cart System**:
  - Add products with specific quantity to cart.
  - Prevent adding items beyond available stock.
- **Customer Checkout**:
  - Checks for:
    - Expired items
    - Out-of-stock products
    - Insufficient customer balance
  - Calculates:
    - Subtotal
    - Shipping fees
    - Final amount
    - Updated customer balance
  - Prints a formatted checkout receipt.
- **Shipping Service**:
  - Collects and groups shippable items.
  - Outputs quantity and total weight per item.
  - Displays total package weight.

---

## 📂 Project Structure

src/
├── Products_pac/
│ ├── Product.java
│ ├── ExpiringProduct.java
│ ├── NonExpiringProduct.java
│ ├── Cheese.java
│ ├── Biscuits.java
│ ├── Mobile.java
│ └── ShippapleProduct.java
│
├── cart_pac/
│ ├── Cart.java
│ └── CartItem.java
│
├── services/
│ ├── ShippingService.java
│ └── ProductCounter.java (optional)
│
├── customer/
│ └── Customer.java
│
└── Main.java


