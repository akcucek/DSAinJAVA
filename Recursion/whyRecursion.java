package Recursion;

public class whyRecursion
{
    public static void main(String args[])
    {
        message1();
    }

    static void message1()
    {
        System.out.println("Message1");
        message2();
    }

    static void message2()
    {
        System.out.println("Message2");
        message3();
    }

    static void message3()
    {
        System.out.println("message3");
    }
}
