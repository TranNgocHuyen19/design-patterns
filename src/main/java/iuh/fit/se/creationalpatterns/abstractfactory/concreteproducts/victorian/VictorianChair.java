package iuh.fit.se.creationalpatterns.abstractfactory.concreteproducts.victorian;

import iuh.fit.se.creationalpatterns.abstractfactory.abstractproducts.Chair;

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
