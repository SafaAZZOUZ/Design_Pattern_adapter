package main.java.Computer;

public class VideoProjecteur implements  Vga{
    @Override
    public void print(String message) {
        System.out.println("--------------");
        System.out.println(message);
        System.out.println("---------------");

    }
}
