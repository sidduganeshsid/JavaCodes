public class ArrayBufferOverRun {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
