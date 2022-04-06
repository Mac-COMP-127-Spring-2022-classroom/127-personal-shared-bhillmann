package comp127.StreamingDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamingDemo {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1, 2, 3, 4);

        List<Integer> results = new ArrayList<>();
        for (int i: ints) {
            if (i % 2 == 0) {
                results.add(i + 2);
            }
        }
        System.out.println("For loop results: " + results.size());

        List<Integer> resultsStream = ints.stream()
            .filter(x -> x % 2 == 0)
            // .map(a -> a + 2)
            .collect(Collectors.toList());
        System.out.println("Stream results: " + resultsStream.size());

        Long count = ints.stream().filter(x -> x % 2 == 0).count();

        System.out.println("Count of even numbers: " + count);
    }
}
