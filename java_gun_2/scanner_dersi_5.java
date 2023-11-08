package java_gun_2;

import java.util.Scanner;

public class scanner_dersi_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ondalik sayı giriniz.");
        double ondalik = scan.nextDouble();
        System.out.println("Tam sayı giriniz.");
        int tam = scan.nextInt();

        System.out.println("Toplamları : "+(ondalik+
                tam) + "\nÇarpımları : "+ ondalik*tam);
    }
}
