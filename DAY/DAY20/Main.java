import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1, "Shirt", 25.99, 2);
        Product product2 = new Product(2, "Pants", 39.99, 1);
        Cart cart = new Cart();
        cart.addToCart(product1);
        cart.addToCart(product2);
        cart.viewCart();
        cart.checkout();
    }}
