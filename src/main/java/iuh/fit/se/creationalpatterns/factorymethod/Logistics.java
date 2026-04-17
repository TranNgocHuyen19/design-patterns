package iuh.fit.se.creationalpatterns.factorymethod;

import iuh.fit.se.creationalpatterns.simplefactory.Transport;

//Creator
public abstract class Logistics {
    abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
