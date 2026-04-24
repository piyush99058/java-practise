package FILE_HANDLING.io_nio;

import java.nio.file.*;
public class creatingAndWriting {
    public static void main(String[] args) 
    {
        Path path = Paths.get("example.txt");
        String content = "I am Highly paid java developer";
        try{
            Files.write(path,content.getBytes());
            System.out.println("Files written successfully");
        }
        catch(Exception e){
            e.printStackTrace();


        }


    }
}
