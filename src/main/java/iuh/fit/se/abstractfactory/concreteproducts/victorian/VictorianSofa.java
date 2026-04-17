package iuh.fit.se.abstractfactory.concreteproducts.victorian;

import iuh.fit.se.abstractfactory.abstractproducts.Sofa;

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
