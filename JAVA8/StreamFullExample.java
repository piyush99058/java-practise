package JAVA8;
import java.util.*;
import java.util.stream.*;

public class StreamFullExample {

    public static void main(String[] args) {

        // Creating a list of numbers
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30, 10, 15);

        System.out.println("Original List:");
        numbers.forEach(System.out::println);

        // 1. Filter numbers greater than 10
        System.out.println("\nNumbers greater than 10:");
        numbers.stream()
               .filter(n -> n > 10)
               .forEach(System.out::println);

        // 2. Map (multiply each number by 2)
        System.out.println("\nNumbers multiplied by 2:");
        numbers.stream()
               .map(n -> n * 2)
               .forEach(System.out::println);

        // 3. Remove duplicates using distinct
        System.out.println("\nDistinct numbers:");
        numbers.stream()
               .distinct()
               .forEach(System.out::println);

        // 4. Sort the numbers
        System.out.println("\nSorted numbers:");
        numbers.stream()
               .sorted()
               .forEach(System.out::println);

        // 5. Limit the first 3 elements
        System.out.println("\nFirst 3 numbers:");
        numbers.stream()
               .limit(3)
               .forEach(System.out::println);

        // 6. Count elements greater than 15
        long count = numbers.stream()
                            .filter(n -> n > 15)
                            .count();

        System.out.println("\nCount of numbers greater than 15: " + count);

        // 7. Collect results into a new List
        List<Integer> result = numbers.stream()
                                      .filter(n -> n > 10)
                                      .map(n -> n * 2)
                                      .collect(Collectors.toList());

        System.out.println("\nCollected List after filter and map:");
        result.forEach(System.out::println);
    }
}