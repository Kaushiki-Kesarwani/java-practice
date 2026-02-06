import java.util.*;
public class reversestr {//recursion

    public static String revstr(char[] s,int start,int end){
        char temp;
        if(start <= end){
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            revstr(s, start+1, end-1);
        }
        return new String(s);
    }
    public static void main(String []args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = sc.nextLine();

        String str = revstr(s.toCharArray(),0,s.length()-1 );
        System.out.println(str);
    }
}
