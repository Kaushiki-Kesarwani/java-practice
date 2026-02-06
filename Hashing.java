import java.util.*;
public class Hashing {
   public static void main(String[] args) {
    HashMap<String , Integer>Map = new HashMap<>();

    //Insertion
    Map.put("India", 140);
    Map.put("China",130);
    Map.put("US" , 60);
    Map.put("UK",120);

Map.put("UK",50);
    System.out.println(Map);

//search

if(Map.containsKey("China")){
    System.out.println("key exist");
}else{
    System.out.println("key not exist");
}
    
// to know the value of the key
System.out.println(Map.get("China"));
System.out.println(Map.get("Indonesia"));
   

for(Map.Entry<String,Integer> e : Map.entrySet()){
    System.out.println(e.getKey()+" "+ "=" + " " + e.getValue());
    System.out.println();
}
   } 
}
