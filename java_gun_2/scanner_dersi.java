package java_gun_2;

import java.util.Scanner;

public class scanner_dersi {
    public static void main(String[] args) {

        // Konsola yazdırma
        /*String a = "Java güzeldir.";
        System.out.println(a);*/

        //Kullanıcıdan bilgi alma
        /*String b = "Adını yaz.";
        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi yazın.");
        String isim = scan.nextLine();
        System.out.println("Sayın "+isim.toUpperCase()+" sisteminize giriş yapıldı.");*/

        //Kullanıcıdan alınan bilgiyi değerlendirme
        Scanner scan = new Scanner(System.in);
        System.out.println("Karesini almak istediğiniz sayıyı yazınız");
        double girilenSayi = scan.nextDouble();
        System.out.println("Girilen sayının karesi "+girilenSayi*girilenSayi);
    }
}
