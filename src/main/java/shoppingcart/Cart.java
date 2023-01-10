package shoppingcart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart {

    private List<Product> cartitems = new ArrayList<>();

    //Variations
    //Varags
    public void addItemstoCart(Product product)
    {
        cartitems.add(product);
    }

    public List<Product> getItemsInCart()
    {
        return cartitems;
    }

    public void cartSummary()
    {
        System.out.println("----------Items in the Cart-----------");
        Iterator<Product> iterator1 = cartitems.iterator();

        int i=1;
        while (iterator1.hasNext()) {
            Product product = iterator1.next();
            System.out.println(i+"."+product.getName()+ " " + product.getQuantity()+ " " + product.getPrice());
            i++;
        }
    }
}