package week03.arrays;

public class ArraysWithForLoops {
    public static void main(String[] args) {
        int[] age = {12,4,5,1,1234,12,5,1234,123,4,1235,123,4,123,41,235,123,4123,4};

        // for loop ile array'de gezme.
        for(int i = 0;i<age.length;i++){
            System.out.println(age[i]);
        }
        //ArrayIndexOutOfBoundsException -> Array'in dışına taştığımı belirtir.

    }
}
