package comp127.StreamingDemo;

import java.util.ArrayList;
import java.util.List;

public class StreamingDemo {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1, 2, 3, 4);

        List<Integer> results = new ArrayList<>();
        for (int i: ints) {
            if (i % 2 == 0) {
                results.add(i + 2);
            }
        }
        System.out.println(results);

        List<Integer> resultsStream = ints.stream()
            .filter(x -> x % 2 == 0)
            .map(a -> a + 2)
            .toList(); // collector
        System.out.println(resultsStream);
    }
}
