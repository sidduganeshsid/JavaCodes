class Array2Ds {
    public static void main(String[] args) {
        int[][] arr = {{2,3},{34,5}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}