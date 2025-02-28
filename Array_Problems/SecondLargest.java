public class SecondLargest {
    public int getSecondLargest(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must have at least two distinct elements.");
        }

        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                sLargest = largest;
                largest = num;
            } else if (num > sLargest && num < largest) {
                sLargest = num;
            }
        }

        return (sLargest == Integer.MIN_VALUE) ? -1 : sLargest;
    }

    public static void main(String[] args) {
        SecondLargest obj = new SecondLargest();

        int[] arr1 = {10, 20, 30, 40};
        System.out.println(obj.getSecondLargest(arr1));  // Output: 30

        int[] arr2 = {5, 5, 5, 5};
        System.out.println(obj.getSecondLargest(arr2));  // Output: -1 (No second largest)

        int[] arr3 = {9};
        // System.out.println(obj.getSecondLargest(arr3));  // Throws Exception
    }
}
