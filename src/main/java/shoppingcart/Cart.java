package shoppingcart;

import java.util.Iterator;
import java.util.List;

public class Cart {

    public void itemsInCart(List<Products> cartitems)
    {
        Iterator<Products> iterator1 = cartitems.iterator();

        while (iterator1.hasNext()) {
            Products product = iterator1.next();
            System.out.println(product.getName()+ " " + product.getQuantity()+ " " + product.getPrice());
        }
    }
}
