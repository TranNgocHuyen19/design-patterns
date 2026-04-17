package iuh.fit.se.structuralpatterns.adapter.adapter;

import iuh.fit.se.structuralpatterns.adapter.adaptee.HDMIProjector;
import iuh.fit.se.structuralpatterns.adapter.target.USBPort;

public class HDMIAdapter implements USBPort {
    private HDMIProjector projector;

    public HDMIAdapter(HDMIProjector projector) {
        this.projector = projector;
    }


    @Override
    public void connectUSB() {
        projector.connectHDMI();
    }
}
