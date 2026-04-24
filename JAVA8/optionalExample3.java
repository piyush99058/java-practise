package JAVA8;

import java.util.Optional;
public class optionalExample3 {
    public static void main(String[] args) {
        
Optional<String> optional = Optional.ofNullable("java");
optional.ifPresent(N -> System.out.println(N));


    }
}
