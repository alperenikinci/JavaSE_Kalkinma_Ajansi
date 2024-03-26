package week03.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("file.txt");
        } catch (IOException e){
            System.out.println("Veri transferinde bir sorun olustu.");
        }

    }

    public void throwsExample() throws IOException{
            FileWriter fw = new FileWriter("file.txt");
    }
}
