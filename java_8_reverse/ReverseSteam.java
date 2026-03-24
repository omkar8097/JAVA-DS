package java_8_reverse;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class ReverseSteam {
    public static void main(String [] args){
        List<Integer> list1 = Arrays.asList(1,1,2,3,5,6,4,7,8,9,10);
        
        list1.parallelStream().collect(Collectors.collectingAndThen(Collectors.toList(),list->{
            Collections.reverse(list);
            return list.stream();
        })).forEach(a->System.out.println(a));

    }
}
