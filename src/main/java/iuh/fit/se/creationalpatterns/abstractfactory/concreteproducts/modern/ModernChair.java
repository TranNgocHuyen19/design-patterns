package iuh.fit.se.creationalpatterns.abstractfactory.concreteproducts.modern;

import iuh.fit.se.creationalpatterns.abstractfactory.abstractproducts.Chair;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Modern Chair sitOn");
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}
