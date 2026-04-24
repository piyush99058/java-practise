package JAVA8;
import java.util.Optional;
public class optionalExample1 {
    public static void main(String[] args) 
    {
        String name1 = "java";
Optional<String> str =  Optional.ofNullable(name1);
if(str.isPresent()){
    System.out.println("Value is"+str.get());
}
else{
    System.out.println("Value not present");
}




    }
}
