package week03.arrays;

import java.util.Scanner;

public class Q2 {

    /*
    Kullanıcıdan 0 girene kadar hep sayılar alan ve 0 girdiğinde o zamana kadar girilen
     tüm sayıların toplamını ekrana yazdıran java kodunu yazınız.

     */
    public static void main(String[] args) {
        int toplam = 0;
        int sayi;

        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Lütfen bir sayi giriniz : " );
            sayi = scanner.nextInt();
            if(sayi==0){
                System.out.println("0 sayisini girdiniz. Girilen sayilarin toplami hesaplaniyor...");
                break;
            }
            toplam +=sayi;
        }
        System.out.println("Sayilarin toplami = " + toplam);
    }
}
