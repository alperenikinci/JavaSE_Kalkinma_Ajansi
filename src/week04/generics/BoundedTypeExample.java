package week04.generics;

public class BoundedTypeExample {

    public static <T extends Number> void findMinMax(T[] array){
        if (array ==  null || array.length == 0){
            return;
        } // 10,15,9,-10,27
        T min = array[0];
        T max = array[0];

        for(T element : array){
            if(element.doubleValue() < min.doubleValue()){
                min = element;
            }
            if(element.doubleValue() > max.doubleValue()){
                max = element;
            }
        }
        System.out.println("Min : " +min);
        System.out.println("Max : " +max);
    }

    public static void main(String[] args) {
        Integer[] intArr = {1,3,5,-15,75,16};
        Double[] doubleArr = {3.1,1.3,77.123,-16.2332,100.13};
        //String[] nameArr = {"Ali","Ayşe","Mehmet","Ahmet","Ferdi","Fatma"}; ->Çalışmaz

        System.out.println("Integer Array");
        findMinMax(intArr);

        System.out.println("Double Array");
        findMinMax(doubleArr);


    }
 }
