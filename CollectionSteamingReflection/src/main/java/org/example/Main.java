package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Optional;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        String result = numbers.stream()
                .filter(n -> n % 2 == 0) // Non-terminal operation, filter out odd numbers
                .map(n -> n * n) // Non-terminal operation
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        //.forEach(System.out::println); // Terminal operation
        System.out.println(result);

        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();
        System.out.println("Even number sum is: " + sum);

        int min = numbers.stream().reduce(Integer.MAX_VALUE, (a, b) -> Integer.min(a, b));
        System.out.println("Min value: " + min);

        boolean anyMatch = numbers.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println("Are there any even numbers in the list? " + anyMatch);

        Set<String> names = new HashSet<>(Arrays.asList("Julia", "Jose", "Amanda", "Bob", "Luis", "Liza", "Jasmin", "AnnaSofia"));
        long count = names.stream()
                .filter(name -> name.startsWith("J"))
                .count();
        System.out.println("Count of names starting with 'J': " + count);

        IntStream nameLengths = names.stream().mapToInt(name -> name.length());
        double averageNameLength = nameLengths.average().orElse(0.0);
        System.out.println("Average length of names: " + averageNameLength);


        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Julia", 25);
        ageMap.put("Jose", 30);
        ageMap.put("Amanda", 35);
        ageMap.put("Bob", 15);
        ageMap.put("Luis", 72);
        ageMap.put("Liza", 19);
        ageMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        boolean allMatch = names.stream()
            .allMatch(word -> word.length() > 2);
        System.out.println("Do all names have length greater than 2? " + allMatch);


        Optional<String> max = names.stream()
                .max(Comparator.comparing(String::length));
        System.out.println("Longest name: " + max.orElse(""));
    }
}