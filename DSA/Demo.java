package DSA;

public class Demo {
    public static void main(String a[]) {
        int nums[] = { 5, 7, 9, 11, 13 };
        int target = 11;
        int restult = LinearSearch(nums, target);
        int restult2 = BinarySearch(nums, target);

        if (restult != -1)
            System.out.println("Element Found at Index : " + restult);
        else
            System.out.println("element found at Index : " + restult);

        if (restult2 != -1)
            System.out.println("Element Found at Index : " + restult);
        else
            System.out.println("element found at Index : " + restult);
    }

    public static int LinearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("steps taken by linear:" + steps);
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int steps = 0;
        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;
            if (nums[mid] == target) {

                System.out.println("steps taken by binary:" + steps);

                return mid;
            } else if (nums[mid] < target)
                left = mid + 1;

            else
                right = mid + 1;
        }
        return -1;
    }
}