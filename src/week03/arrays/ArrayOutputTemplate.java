package week03.arrays;

public class ArrayOutputTemplate {
    public static void main(String[] args) {
        int[] numberArr= {15,13,20,50,31,56,75};
        int sayac = 0;
        System.out.print("[");
        for(int number : numberArr){
            if(sayac<numberArr.length-1){
                System.out.print(number + ",");
            } else {
                System.out.print(number);
            }
            sayac++;
        }
        System.out.println("]");
        System.out.println("baska bir array");
    }
}
