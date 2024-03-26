package week03.javadoc;

public class JavaDocDeneme {
    //-> yorum satırı.
    //Bilgilendirme mesajı gibi. Kendime not tutabilirim.
    //ctrl + / bir arada basarak çoklu satırı yorum satırı haline getirebilirim.
    //TODO -> Yapilacaklar listesi gibi calisir. Projede TODO ile isaretlenmis
    // butun yorumlar ayrica goruntulenebilir. Proje uzerinde herkesin gorebilecegi,
    // gozden kacmamasi gereken, mutlaka halledilmesi gereken şeyler için not almakta
    // rahatlıkla kullanılabilir.
    /*
        Yorum blogu. Bunun icerisinde de paragraflar yazabiliriz. Bu blok icinde yazılan her şey
        bir yorum olarak görüntülenir.
     */
    private /*buraya istedigim şeyi yazabilirim ve bu kodun calismasini engellemez.*/long getSquare(int number){
//           return  (long) Math.pow(number,2);
        return number*number;
    }

    /**
     *  -> javaDoc bloğu, dışarıdan bir tam sayı alır ve bu sayının karesini döner.
     * @param number
     * @return returns the square of the number
     */
    public static long getSquare2(int number){
        return number*number;
    }
    public static long getSquare3(int number){
        return number*number;
    }
    /*
    https://docs.oracle.com/en/java/javase/11/tools/javadoc.html#GUID-9D532574-1CDB-4D30-99F3-A308DCAEE55F
    https://www.tutorialspoint.com/java/java_documentation.htm

     */
}
