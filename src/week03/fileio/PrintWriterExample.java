package week03.fileio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("printWriter.txt");
        pw.println("hello");
        pw.println("world");
        pw.println();
        pw.println("java");
        pw.flush();
        pw.close();
    }
}
