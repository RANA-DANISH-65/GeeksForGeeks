public class MaxConsecutive {
    public static int getMaxConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }

        return Math.max(maxCount, count);
    }

    public static void main(String[] args) {
        int arr1[] = {0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1};
        System.out.println(getMaxConsecutive(arr1));

        int arr2[] = {1, 1, 1, 1, 1};
        System.out.println(getMaxConsecutive(arr2));

        int arr3[] = {0, 1, 0, 1, 0, 1};
        System.out.println(getMaxConsecutive(arr3));

        int arr4[] = {};
        System.out.println(getMaxConsecutive(arr4));

        int arr5[] = {1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0};
        System.out.println(getMaxConsecutive(arr5));
    }
}
