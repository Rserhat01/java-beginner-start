package java_gun_3;

import java.util.Scanner;

public class char_data_casting {
    public static void main(String[] args) {
        /*
        char data türünün ekstra özelliği var
        eğer matematiksel işleme char data türünü kullanırsanuz
         java o char ın ascıı göz önünde bulundurarak matematiksel
         işlemi gerçekleştirir
        */

        System.out.println('a'+'b'); //97 + 98 = 195

        System.out.println('a'-32); // 65

        System.out.println((char)('a'-32)); // A



        //UYGULAMA-1 : kULLANICIDAN BİR CHAR AL
        //ASCİİ TABLE DAN KULLANICININ GİRDİĞİ CHARİN SONRAKİ
        //3 CHARI YAZDIR
        //ornek input:a output:b,c,d

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz.");
        char harf  = scan.next().charAt(0);
        System.out.println((char)(harf + 1)+","+(char)(harf + 2)+","+(char)(harf + 3));

    }
}
