import java.util.*;
class MaxMinEle{

     public static ArrayList<Integer> findMinMax(int[] arr) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

ArrayList<Integer>res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mini){
                mini = arr[i];
            }

            if(arr[i]>maxi){
                maxi = arr[i];
        }
        }

        res.add(mini);
        res.add(maxi);

        return res;
     }
    public static void main(String args[]){
        ArrayList<Integer>res = new ArrayList<>();
        int arr[] = {9,5,4,2,7,1000,0};
        res = findMinMax(arr);
        System.out.println(res);

    }
}