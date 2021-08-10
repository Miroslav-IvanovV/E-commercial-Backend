package eu.deltasource.internship.Ecommercial.backend;

import model.Cart;
import model.CartItem;
import model.Product;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("cheese", 3);
        Product product2 = new Product("beer", 3);
        System.out.println(product1);

        CartItem cartItem = new CartItem(product1, 3);
        CartItem cartItem1 = new CartItem(product2, 3);
        System.out.println(cartItem);
        System.out.println(cartItem.calculatePrice());

        Cart cart = new Cart();
        cart.addItem(cartItem1);
        cart.addItem(cartItem);
        cart.removeItem("beer");
        System.out.println(cart);
        System.out.println(cart.calculateTax());
        System.out.println(cart.calculateFinalPrice());
    }
}
