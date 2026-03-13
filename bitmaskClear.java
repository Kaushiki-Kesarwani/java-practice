public class bitmaskClear {
     public static void main(String args[]){
   int n = 5;
   int pos = 2;
   int bitmask = 1 << pos;
   int notBitMask = ~(bitmask);

int newNumber = notBitMask & n;
System.out.println("new Number : "+ newNumber);
    }
}
