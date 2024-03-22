package week02;

import java.util.Random;

public class WhileZarSorusu {

    public static void main(String[] args) {
        int zar1, zar2, sayac= 1,count=0;
        Random random = new Random();


        while(sayac<100000000) {
            zar1 = random.nextInt(1,7);
            zar2 = random.nextInt(6)+1;
            if (zar1 + zar2 == 12 || zar1 == 6 && zar2 == 6) {
//                System.out.println(sayac+". denemede 6-6 atıldı.");
                count++;
            } else {
//                System.out.println("Zar1 : " + zar1 + "\tZar2 : " + zar2);
            }
            sayac++;
        }
        double oran = (((double) count)/ sayac);
        System.out.println(oran);
    }
}
