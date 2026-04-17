package iuh.fit.se.abstractfactory.concreteproducts.victorian;

import iuh.fit.se.abstractfactory.abstractproducts.Chair;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("VictorianChair sitOn");
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}
