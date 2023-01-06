package shoppingcart;

import java.util.List;
import java.util.Scanner;

public class Payment {
    private double total=0;
    private double discountTotal =0;
    private int quantity=0;

    public void generateBill(List<Products> listofproducts)
    {
        for (Products product:listofproducts) {
            total+= product.getPrice();
            checkBuyTwoGetOneMilkOffer(product);
        }
        System.out.println("Total no of Milk in the cart after availing offer: "+quantity);
        finalPayment();
    }

    public void checkBuyTwoGetOneMilkOffer(Products product)
    {
        if(product.getName().equalsIgnoreCase("Milk"))
        {
            quantity= product.getQuantity();
            if(quantity==2) {
                quantity++;
                product.setQuantity(quantity);
                System.out.println("You will get 1 litre of milk free");
            }
        }
    }

    public void finalPayment(){
        System.out.println("Enter \"w\" for wallet and \"c\" for cash payment:");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        if(input.equalsIgnoreCase("w") && total>=100.00){
            discountTotal =total*.05;
            System.out.println("5 % discount on wallet payment Discounted Total: "+(total-discountTotal));
        }
        else if(input.equalsIgnoreCase("c")){
            System.out.println("Total Price: "+total);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
