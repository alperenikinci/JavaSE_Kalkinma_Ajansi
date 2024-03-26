package week03.methods;

import week03.javadoc.JavaDocDeneme;

import java.util.Scanner;

public class MethodQuestion {
    /*
        Girilen bir tam sayının karesini alan bir method olusturalim. Bu method non-static olsun.
        Daha sonra kullanıcıdan 2 adet sayi isteyelim. Bu sayilardan kucuk olanindan baslayarak, buyuk olan
        sayiya kadar aradaki butun sayilarin karesini metot yardimiyla alalim ve yazdiralim.
     */

    public static void main(String[] args) {
        JavaDocDeneme.getSquare2(12);
        JavaDocDeneme.getSquare3(12);
        MethodQuestion methodQuestion = new MethodQuestion(); // -> MethodQuestion() -> constructor method.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen 1. sayiyi giriniz : ");
        int num1 = scanner.nextInt(); // -> scanner.nextInt()+"/n";
        scanner.nextLine();
        System.out.print("Lutfen 2. sayiyi giriniz : ");
        int num2 = Integer.parseInt(scanner.nextLine()); // Integer.parseInt("\n")

        int min;
        int max;
        if(num1>num2){
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }

        for(int i = min; i<=max;i++){
            System.out.println(methodQuestion.getSquare(i));
        }
//        min = Math.min(num1,num2);
//        max = Math.max(num1,num2);
//        System.out.println(min);
//        System.out.println(max);

    }


    public long getSquare(int number){
//           return  (long) Math.pow(number,2);
        return number*number;
    }



}
