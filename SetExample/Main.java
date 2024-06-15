import java.util.*;
public class Main {
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        set.add(2);
        set.add(67);
        set.add(89);
        set.add(67);
        System.out.println("set:"+set);
        
  
        HashSet<Integer> set1=new HashSet<>();
        set1.add(34);
        set1.add(31);
        set1.add(89);
        set1.add(22);
        System.out.println("set1:"+set1);
        //to do union
        set.addAll(set1);
        System.out.println(set);
        //set -> 2 67 89 34 31 22
        
        //removing the common element
        set.removeAll(set1);
        System.out.println(set);
        //set -> 2 67
        //intersection
        set.retainAll(set1);
        System.out.println(set);
        //set ->> []
        System.out.println(set.contains(34));

    }
}
