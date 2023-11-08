package java_gun_2;

import java.util.Scanner;

public class scanner_dersi_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdörtgenin kısa kenar uzunluğunu giriniz.");
        double kisaKenar = scan.nextDouble();
        System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz.");
        double uzunKenar = scan.nextDouble();

        System.out.println("Dikdörtgenin alanı : "+kisaKenar*uzunKenar);

    }
}
