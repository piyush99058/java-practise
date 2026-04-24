package FILE_HANDLING;
import java.io.File;
public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("got.txt");
        if(file.delete()){
            System.out.println("File deleted successfully");
        }
        else{
            System.out.println("No file present");
        }
    }
}
