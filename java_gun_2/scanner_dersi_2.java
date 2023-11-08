package java_gun_2;

import java.util.Scanner;

public class scanner_dersi_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("Lütfen soy isminizi giriniz");
        String soyIsim = scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scan.nextInt();

        System.out.println("İsminiz: "+isim+"\nSoyisminiz: "+soyIsim+"\nYaşınız: "+yas+"\nKaydınız başarıyla oluşturulmuştur.");
    }
}
