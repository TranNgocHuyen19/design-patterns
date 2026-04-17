package iuh.fit.se.behavioralpatterns.advancedstrategy;

public class Item {
    private String upcCode;
    private int price;

    public Item(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public String getUucCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }

}
