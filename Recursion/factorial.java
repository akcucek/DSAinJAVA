package Recursion;
import java.util.Scanner;

public class factorial
{
    public static void main(String args[])
    {
        Scanner f=new Scanner(System.in);
        int fact=f.nextInt();

        System.out.println(facto(fact));
    }
    static int facto(int fact)
    {
        if (fact==1)
        {
         return fact;
        }

        return fact*facto(fact-1);
    }
}
