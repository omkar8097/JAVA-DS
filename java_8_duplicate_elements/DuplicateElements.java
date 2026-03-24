package java_8_duplicate_elements;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String []args){

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,144,144,1,2,3,5,6,8,9,0,0);
        Set<Integer> set = new HashSet<>();

        list.stream().filter(n->!set.add(n)).collect(Collectors.toList()).forEach(n->System.out.println(n));

    }
}
