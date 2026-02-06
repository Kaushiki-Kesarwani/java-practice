import java. util.*;
public class movex {
    public static String moveX(String s,int idx,char ch, StringBuilder s1,StringBuilder s2){
        if(idx == s.length()){
            return new String(s1.append(s2));
        }

if(s.charAt(idx) == ch){
    s2.append(s.charAt(idx));
}
else{
    s1.append(s.charAt(idx));
}
return moveX(s, idx+1 , ch, s1, s2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        StringBuilder s1 = new StringBuilder();
          StringBuilder s2 = new StringBuilder();

        String str = moveX(s, 0, 'x', s1, s2);
        System.out.println(str);

    }
}
