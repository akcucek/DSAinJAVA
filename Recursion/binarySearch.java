package Recursion;
import java.lang.*;

public class binarySearch
{
    public static void main(String[] args)
    {
        int[] arr = {1,6,7,8,45,78,89};
        int target =16;

        System.out.println("Element is found or not");
        System.out.println(bin(arr, target,0,arr.length-1));
    }

    static int bin(int[] arr,int tar,int s,int e)
    {
        if(s>=e)
        {
            return -1;
        }
        int mid=(e+s-1)/2;

        if(arr[mid]==tar)
        {
            System.out.println("found");
            return mid;
        }
        else if(tar<arr[mid])
        {
            return bin(arr,tar,s,mid-1);
        }
        else
        {
            return bin(arr,tar,mid+1,e);
        }

    }
}
