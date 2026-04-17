package iuh.fit.se.behavioralpatterns.state;

public interface State {
    void insertCoin(VendingMachineContext machine);
    void selectDrink(VendingMachineContext machine);
}
