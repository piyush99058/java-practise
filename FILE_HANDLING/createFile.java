package FILE_HANDLING;

import java.io.File;
import java.io.IOException;
public class createFile {
    public static void main(String[] args) 
    {
        
        try{
            File file = new File("Sample.txt");
            if(file.createNewFile()){
                System.out.println("File created : "+file.getName());
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println("Error occured");
        }


    }
}
