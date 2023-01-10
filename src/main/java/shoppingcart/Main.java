package shoppingcart;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Select Products

        Product milk=new Product("Milk",50.00,2);
        Product apple=new Product("Apple", 40.00, 1);
        Product newspaper=new Product("NewsPaper",12.00,1);

        // Add items to cart
        Cart cart = new Cart();
        cart.addItemstoCart(milk);
        cart.addItemstoCart(apple);
        cart.addItemstoCart(newspaper);

        // Display cart summary
        cart.cartSummary();

        // Get Items from Cart
        List<Product> cartitems = cart.getItemsInCart();

        // Generate Bill
        Billing billing = new Billing();
        billing.generateBill(cartitems);

        System.out.println("Enter \"w\" for wallet and \"c\" for cash payments payment through wallet is eligible for additional 5% discount:");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();

        if(input.equalsIgnoreCase("w")){
            WalletPayment walletPayment = new WalletPayment();
            walletPayment.paymentCalculations(cartitems);
        }
        else if(input.equalsIgnoreCase("c")){
            CashPayment cashPayment = new CashPayment();
            cashPayment.paymentCalculations(cartitems);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
