package week03.methods;

public class VoidMethods {
    public static void main(String[] args) {
        //Kaliteli pratik, gerçek yazılımcı yöntemi (OG)
        sayHello("BilgeAdam");
        methodRankPoints(110);
        sayHello("Alperen");
        methodRankPoints(270.5);


        // Kötü kaka yöntem.
//        String username1 = "Alperen";
//        String username2 = "BilgeAdam";
//        System.out.println("Merhaba "+ username1.toUpperCase() + "! Hoş geldin!");
//        System.out.println("Merhaba "+ username2.toUpperCase() + "! Hoş geldin!");
    }

    public static void sayHello(String username){
        System.out.println("Merhaba " + username.toUpperCase()+"! Hoş geldin!");
    }

    public static void methodRankPoints(double points){
        if(points>=202.5){
            System.out.println("Rank : A1");
        } else if(points >= 122.4){
            System.out.println("Rank : A2");
        } else {
            System.out.println("Rank : A3");
        }
    }


}
