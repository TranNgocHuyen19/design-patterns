package iuh.fit.se.factorymethod;

import iuh.fit.se.simplefactory.Transport;

//Creator
public abstract class Logistics {
    abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
