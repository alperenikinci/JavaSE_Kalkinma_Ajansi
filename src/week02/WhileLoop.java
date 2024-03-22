package week02;

public class WhileLoop {

    public static void main(String[] args) {
        int start = 0, finish = 5;
        boolean exitStatus = false;
        while (true){
            System.out.println("Start degeri : " + start + "\tFinish degeri : " + finish);
            start++;
            finish--;
            if(finish==0){
                break;
            }
        }
    }
}
