import java.util.*; //recursion
public class sortedArray {
  public static boolean isSorted(int []arr, int n){
 
    if(n == 0 || n==1){
        return true;
    }
    if(arr[n-1] >= arr[n-2]){
       return isSorted(arr, n-1);
    }
    return false;
  }
    public static void main(String[]args){
int arr[] =  {1,6,8,10,15};
System.out.println(isSorted(arr,arr.length));

    }
}
