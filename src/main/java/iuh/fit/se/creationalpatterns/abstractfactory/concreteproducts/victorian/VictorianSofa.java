package iuh.fit.se.creationalpatterns.abstractfactory.concreteproducts.victorian;

import iuh.fit.se.creationalpatterns.abstractfactory.abstractproducts.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("VictorianSofa lieOn");
    }

    @Override
    public boolean isComfortable() {
        return true;
    }
}
