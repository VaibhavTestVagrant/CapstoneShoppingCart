package shoppingcart;

import java.util.List;

public class Offer {
    public static void checkBuyTwoGetOneOffer(Product product) {
            if (product.getName().equalsIgnoreCase("Milk")) {
                int quantity = product.getQuantity();
                if (quantity == 2) {
                    int addon = (int)quantity / 2;
                    product.setQuantity(quantity+addon);
                    product.setPrice(quantity* product.getPrice());
                    System.out.println("Congrats! You are eligible for offer buy 2 liters of milk and get 1 free");
                    System.out.println("");
                }
                }
            }

    public static void checkBuyThreeGetFiveOffer(Product product) {
            if (product.getName().equalsIgnoreCase(" ")) {
                int quantity = product.getQuantity();
                if (quantity >= 2) {
                    int addon = (int)quantity / 2;
                    product.setQuantity(quantity+addon);
                    System.out.println("");
                    System.out.println("Congrats! You are eligible for offer buy 2 liters of milk and get 1 free");
                }
            }
        }
    }
