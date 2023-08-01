import java.util.ArrayList;
import java.util.List;


 public class Cart {
    private List<Product> cartItems;
    public Cart(){
        cartItems=new ArrayList<>();
    }
    public void addToCart(Product product){
       cartItems.add(product);
    }
    public void removeFromCart(Product product){
       cartItems.remove(product);

    }
    public void updateQuantity(Product product,int quantity){
       product.setQuantity(quantity);

    }
    public void  viewCart(){
       System.out.println("Your Cart:");
       for (Product product : cartItems){
          System.out.println(product.getProductName()+ " - Quantity: " + product.getQuantity() + " - Price: $" + product.getPrice());
       }

    }
    public void checkout(){



    }
}
