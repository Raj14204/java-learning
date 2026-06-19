package DSA;

public class RecursionInBinary {
    public static void main(String a[]) {
        int nums[] = { 5, 7, 9, 11, 13 };
        int target = 11;

        int restult2 = BinarySearch(nums, target, 0, nums.length - 1);

        if (restult2 != -1)
            System.out.println("Element Found at Index : " + restult2);
        else
            System.out.println("element found at Index : " + restult2);
    }

    public static int BinarySearch(int[] nums, int target, int left, int right) {

        if (left <= right) {

            int mid = (left + right) / 2;

            if (nums[mid] == target) {

                return mid;
            } else if (nums[mid] < target)
                return BinarySearch(nums, target, mid + 1, right);

            else
                return BinarySearch(nums, target, left, mid - 1);

        }
        return -1;
    }
}
