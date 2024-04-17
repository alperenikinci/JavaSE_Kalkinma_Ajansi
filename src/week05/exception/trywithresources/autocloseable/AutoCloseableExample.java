package week05.exception.trywithresources.autocloseable;

import java.io.IOException;

public class AutoCloseableExample {
    public static void main(String[] args) {
        try(Computer computer = new Computer()) {
            computer.run();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
