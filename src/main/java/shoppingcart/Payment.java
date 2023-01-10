package shoppingcart;

import java.util.List;

public interface Payment {

    public void paymentCalculations(List<Product> cartitems);

//    public void paythroughwallet() {
//        if(totalcost>=100.00) {
//            System.out.println("Congrats! You are eligible for additional 5% discount");
//            double discountTotalcost = totalcost * .05;
//            System.out.println("Amount to be paid after discount: " + (totalcost - discountTotalcost));
//        } else{
//            System.out.println("Amount to be paid: "+totalcost);
//            System.out.println("Minimum cart items worth should be Rs 100 in order to avail additional 5% discount");
//
//
//    public void paythroughcash() {
//        System.out.println("Amount to be paid: "+totalcost);
//    }
}
