import java.util.*;
public class print_nums {   //recursion 

    public static void printNumbers(int n){

        if(n==1){
            System.out.println(n);
            return;
        }
          printNumbers(n-1);
        System.out.println(n);
      
    }
    public static void main(String[]args){
        int n = 15;
        printNumbers(n); 
    }
}
