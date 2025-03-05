public class InsertK {
    class Solution {
        public static void duplicateK(int[] arr, int k) {
            int n = arr.length;
            int count = 0;

            // Step 1: Count occurrences of K
            for (int num : arr) {
                if (num == k) count++;
            }

            // Step 2: Start from the last index and shift elements
            int writeIdx = n + count - 1;

            // Traverse from the end to modify in-place
            for (int i = n - 1; i >= 0; i--) {
                if (writeIdx < n) arr[writeIdx] = arr[i];
                writeIdx--;

                // Duplicate K if found
                if (arr[i] == k) {
                    if (writeIdx < n) arr[writeIdx] = k;
                    writeIdx--;
                }
            }
        }


        }
    public static void main(String[] args) {
        int[] arr = {7, 5, 8};
        int k = 8;

        Solution.duplicateK(arr, k);

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
