import java.util.*;

public class SortList {
    static <T extends Comparable<T>> void sort(List<T> l){
        Collections.sort(l);
    }

    public static void main(String[] args){
        List<Integer> a=Arrays.asList(5,2,9);
        List<String> b=Arrays.asList("Z","A","M");

        System.out.println(a);
        sort(a);
        System.out.println(a);

        System.out.println(b);
        sort(b);
        System.out.println(b);
    }
}
