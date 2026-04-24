package FILE_HANDLING;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_ {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader((new FileReader("sample.txt")));
        String LINE;
        while((LINE = br.readLine()) != null)
        {
                System.out.print(LINE + " ");
        }
        br.close();

System.out.println("File printed succesfully");
    }
}
