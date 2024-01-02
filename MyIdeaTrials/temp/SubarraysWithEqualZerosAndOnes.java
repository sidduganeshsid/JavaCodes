// import java.util.HashMap;
// import java.util.Map;

// public class SubarraysWithEqualZerosOnes {

//     public static int countSubarrays(int[] arr) {
//         int n = arr.length;

//         // Create an array to store the prefix sum of the array
//         int[] prefixSum = new int[n + 1];

//         // Initialize count variables
//         int count = 0;
        
//         // Create a map to store the count of each prefix sum
//         Map<Integer, Integer> prefixSumMap = new HashMap<>();
        
//         // Initialize the map with the prefix sum of 0 at index -1
//         prefixSumMap.put(0, 1);

//         // Calculate the prefix sum
//         for (int i = 1; i <= n; i++) {
//             prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
//         }

//         // Count the subarrays with equal 0's and 1's
//         for (int i = 0; i <= n; i++) {
//             if (prefixSumMap.containsKey(prefixSum[i])) {
//                 count += prefixSumMap.get(prefixSum[i]);
//                 prefixSumMap.put(prefixSum[i], prefixSumMap.get(prefixSum[i]) + 1);
//             } else {
//                 prefixSumMap.put(prefixSum[i], 1);
//             }
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         int[] arr1 = {1, 0, 0, 1, 0, 1, 1};
//         int[] arr2 = {1, 0, 0, 1, 1, 0, 0, 1};

//         int output1 = countSubarrays(arr1);
//         int output2 = countSubarrays(arr2);

//         System.out.println("Output for arr1: " + output1);
//         System.out.println("Output for arr2: " + output2);
//     }
// }


import java.util.HashMap;

public class SubarraysWithEqualZerosAndOnes {

    // Function to count subarrays with an equal number of 0's and 1's
    static int countSubarrays(int arr[]) {
        int n = arr.length;

        // Create an empty map to store the count of prefix sums
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();

        // Initialize variables
        int sum = 0;  // current prefix sum
        int count = 0; // count of subarrays

        // Traverse the array
        for (int i = 0; i < n; i++) {
            // Update the prefix sum
            sum += (arr[i] == 0) ? -1 : 1;

            // If the current sum is zero, increment the count
            if (sum == 0) {
                count++;
            }

            // If the current sum is already in the map, increment the count by the
            // frequency of that sum
            if (prefixSumCount.containsKey(sum)) {
                count += prefixSumCount.get(sum);
            }

            // Update the prefix sum count
            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    // Driver code
    public static void main(String[] args) {
        // int arr[] = {1, 0, 0, 1, 0, 1, 1};
        int arr[] = {1, 0, 1, 0, 1};
        int result = countSubarrays(arr);
        System.out.println("Number of subarrays with equal 0's and 1's: " + result);
    }
}

