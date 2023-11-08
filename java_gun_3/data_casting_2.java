package java_gun_3;

import java.util.Scanner;

public class data_casting_2 {
    public static void main(String[] args) {
        //System.out.println(28/5); // 5
        //System.out.println(29/3); // 9
        //Java bölme işleminde sayları int olarak algılar ve int olarak verir.

        // UYGULAMA-1 : Kullanıcıdan 2 tam sayı al ve bölme işlemi yap.
        // Bölme işlemi ondalık olsun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bölme için tam sayıları giriniz");
        int a = scan.nextInt();
        //double b = scan.nextDouble(); // 1.yol
        int b = scan.nextInt();

        //System.out.println("Bölme işleminin sonucu: "+a/b);//1.yol
        System.out.println("Bölme işleminin sonucu: "+(double)a/b);
    }
}
