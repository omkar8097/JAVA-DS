package java_8_even_no;

import java.util.*;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main (String[] args){

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,12);
        list.stream().filter(num->num%2==0).forEach(n->System.out.println(n));

        
    }
}
