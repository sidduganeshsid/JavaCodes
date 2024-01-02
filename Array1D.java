import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        // int[] a = {20,30,40,40};
        // for(int i=0;i<a.length;i++)
        //     System.out.println(a[i]);

        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("enter the elems to store :");
            a[i] = sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(i+"th element is "+a[i]);
        }

    }
}
