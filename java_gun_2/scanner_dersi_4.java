package java_gun_2;

import java.util.Scanner;

public class scanner_dersi_4 {
    public static void main(String[] args) {

        // Swap algoritmasi -- Kova- kum-su

        Scanner scan = new Scanner(System.in);

        System.out.println("İlk tam sayıyı giriniz.");
        int ilkSayi = scan.nextInt();

        System.out.println("İkinci tam sayıyı giriniz.");
        int ikinciSayi = scan.nextInt();

        int temp = ikinciSayi;
        ikinciSayi = ilkSayi;
        ilkSayi = temp;




        System.out.println("ilk sayı: "+ilkSayi+"\nikinci sayı: "+ikinciSayi);
    }
}
