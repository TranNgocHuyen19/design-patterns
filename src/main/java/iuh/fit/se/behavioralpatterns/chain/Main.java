package iuh.fit.se.behavioralpatterns.chain;

public class Main {
    public static void main(String[] args) {
        DispenseChain dispenser50 = new Dollar50Dispenser();
        DispenseChain dispenser20 = new Dollar20Dispenser();
        DispenseChain dispenser10 = new Dollar10Dispenser();

        dispenser50.setNextChain(dispenser20);
        dispenser20.setNextChain(dispenser10);

        Currency currency = new Currency(130);
        dispenser50.dispense(currency);
    }
}
