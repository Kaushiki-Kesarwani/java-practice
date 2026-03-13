
import java.util.*;
public class bitmaskGet {
    public static void main(String args[]){
        int n = 3;
        int pos = 2;
        int bitmask = 1<<pos;
        if((n & bitmask) == 0){
            System.out.println("bit was 0");
        }else{
            System.out.println("bit was 1");
        }
    }
   
}
