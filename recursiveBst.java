import java.util.*;
public class recursiveBst {
    public static int bst(int []arr,int start,int end,int tar){
        if(start <= end){
            int mid = start+(end-start)/2;

            if(arr[mid] == tar){
                return mid;
            }
            else if(arr[mid] < tar){
                start = mid+1;
               return bst(arr,start, end,tar);

            }
            else{
                end = mid-1;
                return bst(arr,start, end,tar);
            }
        
        }
        return -1;
    }

    public static void main(String [] args){
        int []arr = {1,4,5,6,8,12,45,64};
        int st = 0, en = arr.length-1 , tar = 18;
        System.out.println(bst(arr, st, en, tar));

    }
}
