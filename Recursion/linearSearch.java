package Recursion;

public class linearSearch
{
    public static void main(String[] args)
    {
        int[] arr = {1,7,8,9,52,4};
        int tar = 4;

        System.out.println("linear search");
        System.out.println(srch(arr,tar));
    }
     static boolean srch(int[] arr,int tar)
     {
         int s=0;
         int ma=arr.length;
         return helper(arr,tar,s,ma);
     }
     private static boolean helper(int[] arr,int tar,int s, int max)
     {
         if(s==max)
         {
             return false ;
         }
         return arr[s]==tar || helper(arr,tar,s+1,max);
     }
}
