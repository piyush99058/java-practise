package FILE_HANDLING.io_nio;
import java.nio.file.*;

public class copyAndMove {
    public static void main(String[] args) {
        Path source = Paths.get("Source1.txt");
        String content = " I am learning Files.nio component in java . ";
        Path copy = Paths.get("copied1.txt");
        Path moved  = Paths.get("Moved1.txt");

        try{
            Files.write(source,content.getBytes());    
            Files.copy(source,copy);
            Files.move(copy,moved);
            moved.forEach(System.out::println);
            //Files.readAllLines(moved).forEach(System.out::println);
            System.out.println(Files.readAllLines(moved));

        }
        catch(Exception e1){
            e1.printStackTrace();

        }


    }
}
