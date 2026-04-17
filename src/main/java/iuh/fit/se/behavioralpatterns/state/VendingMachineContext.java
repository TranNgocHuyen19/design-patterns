package iuh.fit.se.behavioralpatterns.state;

public class VendingMachineContext {
    private State state;
    private int stock;

    public VendingMachineContext(int stock) {
        this.stock = stock;
        if (stock > 0) {
            this.state = new WaitingForMoneyState();
        } else {
            this.state = new OutOfStockState();
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void insertCoin() {
        state.insertCoin(this);
    }

    public void selectDrink() {
        state.selectDrink(this);
    }

    public void refill(int count){
        stock += count;
        System.out.println("Refilled: " + count + ", current stock: " + stock);
        if(stock > 0) {
            this.state = new WaitingForMoneyState();
        }
    }
}
