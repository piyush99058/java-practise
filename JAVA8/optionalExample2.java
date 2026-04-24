/*
using orElse

*/

package JAVA8;
import java.util.Optional;


public class optionalExample2 
{
    public static void main(String[] args) 
    {
        String name =null;
        Optional<String> str = Optional.ofNullable(name);
        System.out.println(str.orElse("no value present"));



    }
}
