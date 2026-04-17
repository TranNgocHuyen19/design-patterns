package iuh.fit.se.structuralpatterns.adapter;

import iuh.fit.se.Laptop;
import iuh.fit.se.structuralpatterns.adapter.adaptee.HDMIProjector;
import iuh.fit.se.structuralpatterns.adapter.adapter.HDMIAdapter;
import iuh.fit.se.structuralpatterns.adapter.target.USBPort;

public class Main {
    public static void main(String[] args) {
        HDMIProjector projector = new HDMIProjector();
        USBPort adapter = new HDMIAdapter(projector);
        Laptop laptop = new Laptop();
        laptop.connect(adapter);
    }
}
