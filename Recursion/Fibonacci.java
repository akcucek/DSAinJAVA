package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[])
    {
        Scanner fib=new Scanner(System.in);
        int f=fib.nextInt();

        System.out.println(fibo(f));
    }

    static int fibo(int n)
    {
        if(n<2)
        {
            return n;
        }
        return fibo (n-1)+fibo(n-2);
    }

}