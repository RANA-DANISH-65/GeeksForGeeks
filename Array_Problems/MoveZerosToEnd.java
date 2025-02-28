public class MoveZerosToEnd {
    public int[] moveZeros(int[] nums) {
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[nonZeroIndex] + nums[i] - (nums[i] = nums[nonZeroIndex]);
                nonZeroIndex++;
            }
        }
        return nums;
    }
}
