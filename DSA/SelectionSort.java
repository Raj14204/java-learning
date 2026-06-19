package DSA;

public class SelectionSort {

    public static void main(String[] args) {
        int nums[] = { 6, 7, 1, 2 };

        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Selection Sort
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        System.out.println("\nAfter sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}