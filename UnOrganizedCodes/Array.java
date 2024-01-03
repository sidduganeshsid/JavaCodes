import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
       int[] arr = new int[5];
       Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("enter the marks of the students : ");
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("the marks of the students of are;");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}