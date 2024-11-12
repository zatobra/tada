import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class StreamApi {
    public static void main(String[] args) {
        // Sample list of integers
        List<Integer> nubList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Print each element using enhanced for loop
        for (Integer integer : nubList) {
            // System.out.println(integer);
        }

        // Using Stream API and lambda to print elements and their doubled values
        // nubList.forEach(n -> {
        //     System.out.println(n);    // Print the number
        //     System.out.println(n * 2); // Print the number multiplied by 2
        // });

        // Initialize the list 'a' outside the lambda to collect even numbers
        List<Integer> a = new ArrayList<>();

        // Example of using Stream API to filter even numbers and collect them into a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Use Stream API to filter and collect even numbers into the list 'a'
        numbers.stream()
               .filter(n1 -> n1 % 2 == 0)  // Filter even numbers
               .forEach(n1 -> a.add(n1));  // Add each even number to list 'a'

        // Print the list 'a' which contains even numbers

        numbers.stream().parallel().map(m -> m*2).forEach(System.out::println);

        // System.out.println(a);  // Output: [2, 4, 6]
    }
}
