public class reverseWords {
    public static String revWords(String s) {
        if(s == null) return "";
        s = s.trim();
        if(s.isEmpty()) return "";

        String[] str = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            sb.append(str[i]);
            if (i!=0) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }


public static void main(String[] args){
String s = "a good   example";
System.out.println(revWords(s));

}
}