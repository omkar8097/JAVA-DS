package java_8_count_occurance_elements;
import java.util.*;
public class OccuranceCount {
    public static void main(String []a){
        String str = "asadasdasfsdgadafrrvsfsadfsg rf g v sf s d";
        char c = 'a';
        System.out.println(str.chars().filter( b -> b==c).count());

    }
}
