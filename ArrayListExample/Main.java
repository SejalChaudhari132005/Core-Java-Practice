import java.util.*;
class Main{
    public static void main(String[] args){
        ArrayList<String>arr=new ArrayList<>();
        arr.add("6");
        arr.add("8");
        arr.add(0, "8"); //here add(index,element) idx=0,1,2
        System.out.println(arr);

        ArrayList<String>arr3=new ArrayList<>();
        arr3.add("sejal");
        arr3.add("rahul");
        arr3.add("drushti");
        arr3.add("sejal");
        arr3.addAll(arr);
        System.out.println(arr3);
        System.out.println(arr3.lastIndexOf("sejal"));  //used to get lsast occurence of object


        ArrayList<Integer>arr2=new ArrayList<>();
        arr2.add(3);
        arr2.add(45);
        System.out.println(arr2.get(1));
        arr2.remove(1);
        System.out.println(arr2);
        
        
        
    }
}