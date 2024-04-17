package week05.exception.trywithresources.suppressedexception;

import java.io.IOException;

public class Computer implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Shut down...");
        throw new IllegalStateException("Exception is closed!");
        //2.exception.
    }
}
