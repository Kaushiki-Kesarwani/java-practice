public class subsequences { //recursion
    public static void subsequence(String str,int idx,String newstr){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        char curr = str.charAt(idx);

        //to be
        subsequence(str, idx+1, newstr+curr);
        
           //not to be
        subsequence(str, idx+1, newstr);
    }

    public static void main(String []args){
        String s = "aaa";
        subsequence(s, 0, "");
    }
}
