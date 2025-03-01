import java.util.Arrays;

public class PlusOne {
    static int[] addOne(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i] = arr[i] + 1;
                return arr;
            }
            arr[i] = 0;
        }
        int[] newArr = new int[n + 1];
        newArr[0] = 1;
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {9, 7, 8};
        System.out.println(Arrays.toString(addOne(arr))); // Output: [1, 0, 0, 0]
    }
}
