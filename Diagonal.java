public class Diagonal {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                // \ pattern
                if(i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");

                // / pattern
                if(i+j==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
