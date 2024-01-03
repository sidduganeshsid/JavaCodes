public class PyramidPattern {

    // public static void main(String[] args) {
    //     int rows = 5;

    //     for (int i = 1; i <= rows; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public class InvertedPyramid {
        // public static void main(String[] args) {
        //     int rows = 5;
    
        //     for (int i = rows; i >= 1; i--) {
        //         for (int j = 1; j <= i; j++) {
        //             System.out.print("* ");
        //         }
        //         System.out.println();
        //     }
        // }

        // public class HollowPyramid {

            // public static void main(String[] args) {
            //     int rows = 7;
        
            //     for (int i = 1; i <= rows; i++) {
            //         for (int j = i; j < rows; j++) {
            //             System.out.print(" ");
            //         }
            //         for (int k = 1; k <= (2 * i - 1); k++) {
            //             if (k == 1 || k == (2 * i - 1) || i == rows) {
            //                 System.out.print("*");
            //             } else {
            //                 System.out.print(" ");
            //             }
            //         }
            //         System.out.println();
            //     }
            // }
                
            // public class DiamondPattern {

                public static void main(String[] args) {
                    int n = 4;
            
                    for (int i = 1; i <= n; i++) {
                        for (int j = i; j < n; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
            
                    for (int i = n - 1; i >= 1; i--) {
                        for (int j = n; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
            
            
    
    
}
