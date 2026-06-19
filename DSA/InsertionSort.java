package DSA;

public class InsertionSort {

    public static void main(String[] args) {
        int nums[] = { 6, 7, 1, 2 };

        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Insertion Sort
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > current) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = current;
        }

        System.out.println("\nAfter sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}