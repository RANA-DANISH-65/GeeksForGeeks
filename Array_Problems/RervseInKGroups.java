import java.util.*;
class ReverseGroups {
    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    static void reverseInGroups(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n; i += k) {
            int right = Math.min(i + k - 1, n - 1);
            reverse(arr, i, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        reverseInGroups(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
