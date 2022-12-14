
public class oo {
        public static void main(String[] args) {
            Product toothbrush = Catalogue.getProduct("Electric Toothbrush");
            Product babyAlarm = Catalogue.getProduct("Baby Alarm");
            ShoppingCart cart = new ShoppingCart();
            cart.addProduct(toothbrush);
            cart.addProduct(babyAlarm);
            System.out.println(cart);
            System.out.println(cart.getTotalCost());
        }
}
