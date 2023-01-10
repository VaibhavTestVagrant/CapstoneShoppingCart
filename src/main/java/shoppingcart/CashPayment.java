package shoppingcart;

import java.util.List;

public class CashPayment extends Billing implements Discount, Payment{

    @Override
    public double discountOffer(){
        if(totalcost>=100.00) {
            totalcost = totalcost-(totalcost * .05);
        }
        return totalcost;
    }

    @Override
    public void paymentCalculations(List<Product> cartitems) {
        generateBill(cartitems);
        System.out.println("Congrats! You are eligible for additional 5% discount");
        System.out.println("Amount to be paid after discount: " + discountOffer());
    }
}
