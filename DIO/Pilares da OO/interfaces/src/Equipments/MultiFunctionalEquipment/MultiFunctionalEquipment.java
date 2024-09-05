package Equipments.MultiFunctionalEquipment;

import Equipments.Copier.Copier;
import Equipments.Printer.Printer;

public class MultiFunctionalEquipment implements Copier, Printer {
    @Override
    public void copy() {
        System.out.println("MultiEquipment Copying....");
    }

    @Override
    public void print() {
        System.out.println("MultiEquipment Copying....");
    }
}
