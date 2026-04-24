package FILE_HANDLING.io_nio;
import java.io.File;
import java.io.IOException;
import java.nio.file.*; //import java.nio.file.*;
import java.util.List; // import java.nio.List;
public class Reading
{
    public static void main(String[] args)
    {
        Path path = Paths.get("example.txt");   
        try{
            List<String> list = Files.readAllLines(path);
            list.forEach(System.out::println);
        }
        catch(IOException E1){
            E1.printStackTrace();

        }
        
    }
}