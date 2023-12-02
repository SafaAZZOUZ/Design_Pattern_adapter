package main.java.Computer;

public class SuperVP  implements Vga, Hdmi{
    @Override
    public void view(byte[] data) {
        String message=new String(data);
        System.out.println("<<<<<<<<<<<<< Super VP HDMI <<<<<<<<<<<<<<<<<");
        System.out.println(message);
        System.out.println("<<<<<<<<<<<<< Super VP HDMI <<<<<<<<<<<<<<<<<");

    }

    @Override
    public void print(String message) {
        System.out.println("_____________ Supper VP _____________");
        System.out.println(message);
        System.out.println("_____________ Supper VP _____________");
    }
}
