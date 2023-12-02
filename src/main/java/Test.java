package main.java;

import Computer.*;
import Computer.adapter.HdmiVgaAdapter;
import Computer.adapter.HdmiVgaAdapterH;

public class Test {
    public static void main(String[] args) {
        UniteCentre  uniteCentre=new UniteCentre();
        uniteCentre.setVga(new Ecran());
        uniteCentre.print("Bonjour");
        uniteCentre.setVga(new VideoProjecteur());
        uniteCentre.print("bonjour");

        HdmiVgaAdapter hdmiVgaAdapter=new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentre.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("bonsoir GLSID");


        uniteCentre.setVga(new SuperVP());
        uniteCentre.print("hello");

        HdmiVgaAdapterH hdmiVgaAdapterH=new HdmiVgaAdapterH();
        uniteCentre.setVga(hdmiVgaAdapterH);
        hdmiVgaAdapterH.print("TEST ");

        HdmiVgaAdapter hdmiVgaAdapter1=new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCentre.setVga(hdmiVgaAdapter1);
        uniteCentre.print("bonsoir");
    }
}
