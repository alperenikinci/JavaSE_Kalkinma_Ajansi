package week02;

public class NestedForLoop3 {

    public static void main(String[] args) {
        for(int i = 1; i<=7;i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i<=6;i++){
            for (int j = 7-i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
