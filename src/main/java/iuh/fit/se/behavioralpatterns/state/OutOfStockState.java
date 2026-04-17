package iuh.fit.se.behavioralpatterns.state;

public class OutOfStockState implements State{
    @Override
    public void insertCoin(VendingMachineContext machine) {
        System.out.println("Coin inserted");
    }

    @Override
    public void selectDrink(VendingMachineContext machine) {
        System.out.println("Out of stock");
    }
}
