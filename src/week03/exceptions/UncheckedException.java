package week03.exceptions;

import java.util.Scanner;

public class UncheckedException {
    //->Runtime hataları yani çalışma zamanında gerçekleşen hatalar.
    public static void main(String[] args) {
        String name = null;

//        //Kötü kaka yaklaşım.
//        try {
//            if(name.equals("alperen")){
//                System.out.println("name : alperen");
//            }
//        }catch (NullPointerException e){
//            System.out.println("Catch!");
//        }
//
//        // eh işte idare eder. Fena değil.
//        if(name != null && name.equals("alperen")){
//            System.out.println("name : alperen");
//        }

        // WOWW mükemmel. En süper birinci yöntem.
        if("alperen".equals(name)){
            System.out.println("name : alperen");
        }
        //null deger sadece objelere verilebilir.
    }
}
