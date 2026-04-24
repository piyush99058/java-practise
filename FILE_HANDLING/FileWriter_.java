package FILE_HANDLING;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args)
    {
        
       try{
        FileWriter writer = new FileWriter("sample.txt");
        writer.write("Hello i am Piyush. I am a java developer \n" +
        "Working in top multinational company like microsoft \n" +
        "earning more than 15 LPA\n" +
        "before march 2026 .");

        writer.close();
        System.out.println("File written successfully");
       }
       catch(IOException e){

            System.out.println("Error");
       } 



    }
}
