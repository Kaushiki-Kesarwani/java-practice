import java.util.*;
  
public class majorityelement {
    
  public static void majority_element(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
    int count = 0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
         for(Integer key : map.keySet()){
        if(map.get(key)>arr.length/3){
            System.out.println(key);
        }
    }
    }
public static void main(String args[]){
    int arr[]={1,2,4,2,2,1};
    majority_element(arr);
}
}
