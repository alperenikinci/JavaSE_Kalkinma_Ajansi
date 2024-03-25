package week03.arrays;

public class ArrayQ1 {
    public static void main(String[] args) {
        /*
        2, -9, 0, 5, 12, -25, 22, 9, 8, 12,40 sayılarını bir dizi içerisine tanımlayınız.
        Daha sonra for/foreach kullanarak toplamını bulup ekrana yazdıran ve
        sonrasında ise ortalamasını da hesaplayan ekrana yazdıran java kodunu yazınız.
         */

        int[] numArr = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12,40};
        int toplam = 0;
        double ort;
        for(int number : numArr){
            toplam += number;
        }
        System.out.println(toplam);
        ort = toplam/(double)numArr.length;
        System.out.println(ort);

        toplam = 0;
        ort = 0;
        for(int i = 0;i<numArr.length;i++){
            toplam +=numArr[i];
        }
        System.out.println(toplam);
        ort = toplam/(double)numArr.length;
        System.out.println(ort);

    }
}
