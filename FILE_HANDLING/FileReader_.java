package FILE_HANDLING;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ 
{
    public static void main(String[] args)
    {
        try{
            FileReader reader = new FileReader("got.txt");
            int character;
            while((character = reader.read()) != -1){
                System.out.println("characters are : "+ (char)character);
            }
            reader.close();

        }
    catch(IOException e1)
    {
        System.out.println("Error Occured");
    }

        

    }



}
