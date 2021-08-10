package model;

public class CartItem {

    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    /**
     * Showing the characteristics of the cartItem.
     */
    @Override
    public String toString() {
        return "product : " + product + "\n" + "quantity = " + quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    /**
     * @return the price of the products.
     */
    public double calculatePrice() {
        return product.getPrice() * quantity;
    }

}
