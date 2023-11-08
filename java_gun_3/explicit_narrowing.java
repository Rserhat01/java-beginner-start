package java_gun_3;

public class explicit_narrowing {
    public static void main(String[] args) {
        double dbl = 23.5;

        int sayi = (int)dbl;
        System.out.println(sayi); //23

        byte byt = (byte)sayi;
        System.out.println(byt); //23

        sayi = 130;
        byt = (byte)sayi;
        System.out.println(byt); //-126

        sayi = 256;
        byt = (byte) sayi;
        System.out.println(byt); //0
    }
}
