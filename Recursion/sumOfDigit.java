package Recursion;
import java.util.Scanner;

public class sumOfDigit
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int sc=s.nextInt();

        System.out.println(sum(sc));
    }

    static int sum(int sc)
    {
        if((sc%10)==0 & ((sc/10)==0))
        {
            return sc;
        }
        return (sc%10)+sum(sc/10);
    }
}
