package iuh.fit.se.behavioralpatterns.state;

public class HasMoneyState implements State {
    @Override
    public void insertCoin(VendingMachineContext machine) {
        System.out.println("Coin has been inserted");
    }

    @Override
    public void selectDrink(VendingMachineContext machine) {
        if(machine.getStock() > 0) {
            System.out.println("Dispensing drink...");
            machine.setStock(machine.getStock() - 1);
            if(machine.getStock() > 0) {
                machine.setState(new WaitingForMoneyState());
            } else  {
                machine.setState(new OutOfStockState());
            }
        } else {
            machine.setState(new OutOfStockState());
            System.out.println("Out of stock");
        }
    }
}
