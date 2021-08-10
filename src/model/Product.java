package model;

public class Product {

    private String label;
    private double price;

    public Product(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public String getLabel() {
        return label;
    }

    public double getPrice() {
        return price;
    }

    /**
     * Showing the characteristics of the product.
     */
    @Override
    public String toString() {
        return "label : " + label + "\n" + "price = " + price;
    }

}
