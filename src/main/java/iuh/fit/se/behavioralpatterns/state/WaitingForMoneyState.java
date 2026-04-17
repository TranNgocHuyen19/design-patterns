package iuh.fit.se.behavioralpatterns.state;

public class WaitingForMoneyState implements State{
    @Override
    public void insertCoin(VendingMachineContext machine) {
        machine.setState(new HasMoneyState());
    }

    @Override
    public void selectDrink(VendingMachineContext machine) {
        System.out.println("Please insert coin");
    }
}
