import java.util.Scanner;

public class Prime
{
    public static void main(String args[])
    {
        System.out.println("Enter a number to check prime or not : ");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long count;

        sc.close();
        if(num<2)
        {
            System.out.println("not a prime number");
        }
        else if(num==2)
        {
            System.out.println("It is a Prime number");
        }
        else
        {
            for(count=2;count<num;count++)
            {
                if(num%count==0)
                {
                    System.out.println("not a prime number");
                    break;
                }
            }
            if(num==count)
            {
                System.out.println("it is prime number");
            }
            
           
        }

        
    }
}