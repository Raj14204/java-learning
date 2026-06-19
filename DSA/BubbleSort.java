package DSA;

public class BubbleSort {

    public static void main(String[] args) {
        int nums[] = { 6, 7, 1, 2 };

        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Bubble Sort
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}