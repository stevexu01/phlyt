package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Main
{
    public static void main(String[] args)
    {
        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(4, 5);
        List<Integer> c = Arrays.asList(6, 7, 8);

        List<List<Integer>> listOfListofInts = Arrays.asList(a, b, c);

        System.out.println("Before flattening : " + listOfListofInts);

        List<Integer> listofInts = listOfListofInts.stream()
                .flatMap(list -> list.stream())	// or use List::stream
                .collect(Collectors.toList());

        System.out.println("After flattening : " + listofInts);
    }
}
