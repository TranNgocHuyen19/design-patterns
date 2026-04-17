package iuh.fit.se;

import iuh.fit.se.structuralpatterns.adapter.target.USBPort;

public class Laptop {
    public void connect(USBPort device) {
        device.connectUSB();
    }
}
