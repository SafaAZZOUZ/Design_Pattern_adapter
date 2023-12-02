 package main.java.Computer.adapter;

import Computer.Hdmi;
import Computer.TV;
import Computer.Vga;

public class HdmiVgaAdapterH extends TV implements Vga {


    @Override
    public void print(String message) {
        System.out.println("=========== Adapter par h ==========");
        byte[] data =message.getBytes();
        super.view(data);
        System.out.println("=========== Adapter par h ==========");


    }
}
