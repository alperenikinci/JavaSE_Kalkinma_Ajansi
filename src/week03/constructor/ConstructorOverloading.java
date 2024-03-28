package week03.constructor;

public class ConstructorOverloading {
    String country;
    String language;


    ConstructorOverloading(String country, String language){
        this.country=country;
        this.language=language;

    }
    ConstructorOverloading(String country){//Parameterized Constructor (Parametreli Constructor).
        this.country = country;
    }
    ConstructorOverloading(){ //NoArgsConstructor
    }

    public static void main(String[] args) {
        //no-args-constructor. Şu an herhangi bir constructor tanımlanmadığı için default constructor
        //olarak bana no-args-constructor Java tarafından getiriliyor.
        ConstructorOverloading obj1 = new ConstructorOverloading();
        obj1.country= "Turkey";
        obj1.language= "Turkish";

        System.out.println(obj1.country+" "+obj1.language);
        /*
            1.'de NoArgsConstructor kullandık. İki field'ın değerini de
            nesneyi oluşturduktan sonra, ayrı ayrı atadık. Nesneyi oluştururken içini doldurmadık.
        */

        ConstructorOverloading obj2 = new ConstructorOverloading("Germany");
        obj2.language= "German";
        System.out.println(obj2.country+" "+obj2.language);
        /*
            2.'de Parameterized Constructor kullandık. Field'lardan birinin degerini
            nesneyi oluştururken argüman olarak verdik (country), digerini ise
            nesneyi oluşturduktan sonra, dışarıdan atamasını yaptık.
         */

        ConstructorOverloading obj3 = new ConstructorOverloading("England","English");
        System.out.println(obj3.country+" "+obj3.language);
        /*
            3.'de bütün fieldları Parameterized Constructor ile aldık. Dolayısıyla dışarıdan değer
            ataması yapmama gerek kalmadı. Nesneyi oluştururken içini de doldurdum. AllArgsConstructor.
         */
    }
}
