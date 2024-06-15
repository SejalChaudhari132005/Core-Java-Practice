import java.util.HashMap;
import java.util.Map;
class Main{
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        map.put("One",11);
        System.out.println("HashMap:"+map);
        
        //returns value of the key
        int ind=map.get("One");
        System.out.println(ind);

        map.replace("One", 1);
        System.out.println(map);

        //set view of keys--->keyset()
        //set view of values--->values()
        //set view of key/value --->entrySet()
        System.out.println(map.entrySet());

        //iterate keys
        System.out.println("keys:");
        for(String key:map.keySet()){
            System.out.print(key+" ");
        }
        //iterate values
        System.out.println("\nvalues:");
        for(Integer value:map.values()){
            System.out.print(value+" ");
        }

        
        //iterate keys and values
        System.out.println("Keys and values");
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry);
        }
        

        


    }
}