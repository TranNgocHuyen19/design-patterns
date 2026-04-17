package iuh.fit.se.behavioralpatterns.state;

public class Main {
    public static void main(String[] args) {
        VendingMachineContext machine = new VendingMachineContext(2);

        machine.selectDrink();
        machine.insertCoin();
        machine.selectDrink();
        System.out.println("Stock left: " + machine.getStock());

        machine.insertCoin();
        machine.selectDrink();
        System.out.println("Stock left: " + machine.getStock());

        machine.insertCoin();
        machine.selectDrink();

        machine.refill(3);
        machine.insertCoin();
        machine.selectDrink();

        System.out.println("Stock left: " + machine.getStock());
    }
}
