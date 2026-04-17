package iuh.fit.se.behavioralpatterns.chain;

public class Dollar10Dispenser implements DispenseChain{
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 10) {
            int num = currency.getAmount() / 10;
            int remainder = currency.getAmount() % 10;

            System.out.println("Dispensing " + num + " $10 note");

            if (remainder != 0) {
                System.out.println("Remaining amount cannot be dispensed: " + remainder);
            }
        } else {
            System.out.println("Amount too small to dispense: " + currency.getAmount());
        }
    }
}
