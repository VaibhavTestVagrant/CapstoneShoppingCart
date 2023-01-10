package shoppingcart;

import java.util.List;

public class Billing {
    protected double totalcost=0;
    public void generateBill(List<Product> cartitems)
    {
        System.out.println("");
        System.out.println("-------Below is the generated bill------- ");
        System.out.println("");
        int i=1;
        for (Product product:cartitems) {
           totalcost+= product.getPrice()*product.getQuantity();
            Offer.checkBuyTwoGetOneOffer(product);
            Offer.checkBuyThreeGetFiveOffer(product);
           System.out.println(i+"."+product.getName()+":"+product.getQuantity()+":"+product.getPrice());
           i++;
        }
        System.out.println("Amount to be Paid : "+totalcost);
        System.out.println("");
    }
}
