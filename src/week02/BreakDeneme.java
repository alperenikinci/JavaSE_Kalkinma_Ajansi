package week02;

public class BreakDeneme {
    public static void main(String[] args) {
//        for(int i = 0; i<10;i++){
//            if(i==4){
//                break;
//            }
//            System.out.println(i);
//        }

        for(int i = 0; i<10;i++){
            if(i==5){
                return;
                }
                System.out.println("i =" + i);
        }
        System.out.println("Out of loop");
    }

    int sayiToplama(){
        return 0;

    }
}
