package shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Products milk=new Products("Milk",70.00,2);
        Products apple=new Products("Apple", 110.00, 1);
        Products newspaper=new Products("NewsPaper",12.00,1);

        List<Products> cartitems = new ArrayList<>();

        cartitems.add(milk);
        cartitems.add(apple);
        cartitems.add(newspaper);

        Cart cart = new Cart();
        System.out.println("Items in the Cart: ");
        cart.itemsInCart(cartitems);

        Payment payment = new Payment();
        System.out.println("Generated Bill: ");
        payment.generateBill(cartitems);
    }
}
