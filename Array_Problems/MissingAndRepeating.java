import java.util.ArrayList;

public class MissingAndRepeating {
    static ArrayList<Integer> findTwoElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        int repeating = -1, missing = -1;

        for (int i = 0; i < n; i++) {
            int absVal = Math.abs(arr[i]);
            int index = absVal - 1;

            if (arr[index] < 0) {
                repeating = absVal;
            } else {
                arr[index] = -arr[index];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        list.add(repeating);
        list.add(missing);
        return list;
    }


    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        System.out.println(findTwoElement(arr));
    }
}
