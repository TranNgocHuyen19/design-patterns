package iuh.fit.se.behavioralpatterns.advancedstrategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 100);
        Item item2 = new Item("5678", 250);

        cart.addItem(item1);
        cart.addItem(item2);

        System.out.println("Pay with PayPal:");
        cart.pay(new PaypalStrategy("test@gmail.com", "mypwd"));

        System.out.println("Pay with Credit Card:");
        cart.pay(new CreditCardStrategy("Huyen", "123456789", "123", "12/30"));
    }
}
