package Recursion;
import java.util.Scanner;
public class printNumber
{
    public static void main(String args[])
    {
        Scanner num=new Scanner(System.in);
        int n=num.nextInt();

        printNum(n);
    }

    static void printNum(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        printNum(n-1);
        System.out.println(n);
    }
}
