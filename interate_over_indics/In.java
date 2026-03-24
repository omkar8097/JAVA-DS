package interate_over_indics;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class In{
    public static void main(String []ar){

        /* 


        String[] array = { "G", "E", "E", "k" };
        List<String> a = IntStream.range(0,array.length )
        .mapToObj(i-> String.format("%d -> %s", i, array[i])).collect(Collectors.toList());
        System.out.println(a);


        String inputString = "Java Concept Of The Day";
         
        Map<Character, Long> charCountMap = 
                    inputString.chars().mapToObj(c->(char) c)
                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

                    System.out.println(charCountMap);


        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
          System.out.println(
        stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
          );                    

        //How do you sort the given list of decimals in reverse order

        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
         
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);




        // Given a list of integers, find maximum and minimum of those numbers?

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
         
        int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
         
        System.out.println("Maximum Element : "+max);
         
        int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
         
        System.out.println("Minimum Element : "+min);
            

        // How do you merge two unsorted arrays into single sorted array using Java 8 streams?

        // IntStream.concat(Arrays.stream(new int[]{1,2,3,4,5,6,7}), Arrays.stream(new int[]{1,2,3,4,5,6,7})).sorted().forEach(System.out::print);


        // Java 8 program to check if two strings are anagrams or not?

        String s1 = "RaceCar";
        String s2 = "CarRace";
        
        String ss1 = Arrays.stream(s1.split("")).sorted().collect(Collectors.joining());
        String ss2 = Arrays.stream(s2.split("")).sorted().collect(Collectors.joining());
        System.out.println(ss1 + "       " +ss2);

        

        //Find sum of all digits of a number in Java 8?
        int i = 15623;
        Integer resullt = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));


        //Find second largest number in an integer array?

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
         
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        //Given a list of strings, sort them according to increasing order of their length?

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
         
        List l = listOfStrings.stream().sorted(Comparator.comparingInt(s->s.length())).collect(Collectors.toList());
        System.out.println(l);

        // Reverse each word of a string using Java 8 streams?

        String str = "Java Concept Of The Day";
         
        String reversedStr =Stream.of(str.split(" ")).map(w->new StringBuffer(w).reverse()).collect(Collectors.joining(" ","",""));
        System.out.println(reversedStr);


        // How do you find the most repeated element in an array?
        List<String> listOfStrings1 = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
         
        String aaa= listOfStrings1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        .entrySet().stream().max(Comparator.comparingLong(Map.Entry::getValue)).get().getKey();

        System.out.println(aaa);
        */
        
        String str = "ROTATOR";
         
        boolean a = IntStream.range(0, str.length()/2)
        .noneMatch(i->str.charAt(i)!= str.charAt(str.length()-i-1));
        System.out.println(a+" is a palindrome");


        // 29) Fibonacci series

        Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]})
                .limit(10)
                .map(f -> f[0])
                .forEach(i -> System.out.print(i+" "));


        
    }
}