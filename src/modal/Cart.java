package modal;

import java.util.ArrayList;

public class Cart {

    private final static double TAX_PERCENTAGE = 0.20;
    private ArrayList<CartItem> cartItems;
    private double deliveryFee;

    public Cart() {
        this.cartItems = new ArrayList<>();
    }

    @Override
    public String toString() {
        String items = "";
        for (int i = 0; i < cartItems.size(); i++) {
            items += "Cart item : " + cartItems.get(i) + "\n";
        }
        return items + "Delivery fee = " + deliveryFee;
    }

    /**
     * @return the tax of the products.
     */
    public double calculateTax() {
        double tax = 0;
        for (int i = 0; i < cartItems.size(); i++) {
            tax += cartItems.get(i).calculatePrice() * TAX_PERCENTAGE;
        }
        return tax;
    }

    /**
     * @return the final price of the products.
     */
    public double calculateFinalPrice() {
        double itemPrice = 0;
        for (int i = 0; i < cartItems.size(); i++) {
            itemPrice += cartItems.get(i).calculatePrice();
        }

        if (itemPrice < 100) {
            deliveryFee = 10;
            return itemPrice + deliveryFee;
        } else if (itemPrice < 200) {
            deliveryFee = 5;
            return itemPrice + deliveryFee;
        } else {
            deliveryFee = 0;
            return itemPrice + deliveryFee;
        }
    }

    /**
     * Add an item to the cart.
     *
     * @param cartItem gets the item.
     */
    public void addItem(CartItem cartItem) {
        cartItems.add(cartItem);
    }

    /**
     * Remove an item from cart.
     *
     * @param itemLabel gets the name of the item.
     */
    public void removeItem(String itemLabel) {
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getProduct().getLabel() == itemLabel) {
                cartItems.remove(i);
            }
        }
    }

}
