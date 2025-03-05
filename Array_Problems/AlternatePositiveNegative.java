import java.util.ArrayList;
import java.util.List;

public class AlternatePositiveNegative {
    public static void rearrange(ArrayList<Integer> arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (Integer num : arr) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        int i = 0, j = 0, k = 0;
        boolean turnPos = true;


        while (i < pos.size() && j < neg.size()) {
            if (turnPos) {
                arr.set(k++, pos.get(i++));
            } else {
                arr.set(k++, neg.get(j++));
            }
            turnPos = !turnPos;
        }


        while (i < pos.size()) {
            arr.set(k++, pos.get(i++));
        }

        while (j < neg.size()) {
            arr.set(k++, neg.get(j++));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(-2);
        arr.add(-5);
        arr.add(2);
        arr.add(-4);

        System.out.println("Before: " + arr);
        rearrange(arr);
        System.out.println("After:  " + arr);
    }
}
