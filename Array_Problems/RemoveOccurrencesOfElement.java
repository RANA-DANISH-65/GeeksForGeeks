public class RemoveOccurrencesOfElement {
    public static int remove(int[] nums, int target) {
        int p = 0;
        for (int q = 0; q < nums.length; q++) {
            if (nums[q] != target) {
                nums[p] = nums[q];
                p++;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int newLength = remove(nums, 3);
        System.out.println("New length: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
