import java.util.Scanner;

public class bitmaskUpdate {
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
   int n = 5;
   int pos = 1;
   //update bit to 1 else update to 0 

    int bitmask = 1 << pos;
   if(op == 1){
int newNumber = bitmask | n;
System.out.println("new Number : "+ newNumber);
   }
   else{
int notBitMask = ~(bitmask);
   int newNumber =notBitMask & n;
   System.out.println("new Number : "+ newNumber);
   }
   
    }
}
