//File not found or network error.
package EXCEPTION_HANDLING;

import java.io.FileReader;
import java.io.IOException;

public class IOExceptioDemo {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("File Reader.txt");

        } catch (IOException e1) {
            System.out.println("File error: " + e1.getMessage());
        }
        finally{
            System.out.println("completed");
        }
    }
}
