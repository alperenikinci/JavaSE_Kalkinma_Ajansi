package week02;

import java.util.Scanner;

public class ForLoopOrnek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int toplam = 0;
        int sayi = scanner.nextInt();
        for (int i= 1;i<=sayi;i++){
            toplam = toplam +(i +1);
        }
        System.out.println(toplam);
    }
}
