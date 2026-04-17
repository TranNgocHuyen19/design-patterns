package iuh.fit.se.behavioralpatterns.chain;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}
