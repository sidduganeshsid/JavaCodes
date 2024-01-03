public class Rhombustrial
{
    public static void main(String args[])
    {
        int n=10;
        for(int i=0;i<=10;i++)
        {
            for(int j=0;j<=10;j++)
            {
                if(
                    (i+j==(n/2)) ||
                    (j-i==(n/2)) ||
                    (i-j==(n/2)) ||
                    (i+j==n+(n/2))
                )
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}