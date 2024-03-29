package week03.methods.asalsayisorusu;

import java.util.Scanner;

public class Test {
    //1008001
    //5000001557l
    public static void main(String[] args) { /*main metodu kodları çalıştırabilmemiz için kullan bir metottur.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        long number = scanner.nextLong();

        /*PrimeNumberCalculator sınıfının parametresiz bir nesnesini/instance'ını üretiyorum*/
        PrimeNumberCalculator primeNumberCalculatorNoArg = new PrimeNumberCalculator();//Argümansız ürettim.
        primeNumberCalculatorNoArg.number=number; //argümansız ürettiğim için number değerini elle atadım.

        /*PrimeNumberCalculator sınıfının parametreli bir nesnesini/instance'ını üretiyorum*/
        PrimeNumberCalculator primeNumberCalculatorWithArg = new PrimeNumberCalculator(number);//Sayıyı parametre kısmına, argüman olarak verdim.

        long startTime = System.nanoTime();
        if(primeNumberCalculatorWithArg.asalSayiMiOptimize()){
            System.out.println("Asal sayidir");
        } else {
            System.out.println("Asal sayi degildir.");
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime- startTime;
        System.out.println("Programın nano saniye bazında calisma süresi : " + timeElapsed);
        System.out.println("Programın milisaniye bazında calisma süresi : " +(timeElapsed/1000000));

        scanner.close();
    }
}
