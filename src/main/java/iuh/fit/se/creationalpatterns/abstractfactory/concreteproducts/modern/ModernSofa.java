package iuh.fit.se.creationalpatterns.abstractfactory.concreteproducts.modern;

import iuh.fit.se.creationalpatterns.abstractfactory.abstractproducts.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("ModernSofa lieOn");
    }

    @Override
    public boolean isComfortable() {
        return false;
    }
}
