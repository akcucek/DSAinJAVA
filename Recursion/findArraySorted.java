package Recursion;

public class findArraySorted
{
    public static void main(String[] args)
    {
        int[] arr={2,4,6,7,90,8};
        System.out.println(sorted(arr));
    }

    static boolean sorted(int[] arr)
    {
        int k= arr.length;
        return helper(arr,0,k-1);
     }

    private static boolean helper(int[] arr,int s,int d)
    {
        if(s==d)
        {
            return true;
        }
        if(arr[s]>arr[s+1])
        {
            return false;
        }

        if(s!=d)
        {
            if(arr[s]<arr[s+1])
            {
                ++s;
            }
        }
        return helper(arr,s,d);
    }
}
