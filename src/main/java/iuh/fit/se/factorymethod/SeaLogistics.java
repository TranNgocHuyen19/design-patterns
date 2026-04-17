package iuh.fit.se.factorymethod;

import iuh.fit.se.simplefactory.Ship;
import iuh.fit.se.simplefactory.Transport;

//Concrete Creator
public class SeaLogistics extends Logistics {

    @Override
    Transport createTransport() {
        return new Ship();
    }
}
