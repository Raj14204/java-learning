// int num[] = {5,6,7};
// int num1[] = new int[4];
public class Array {
    public static void main(String a[]) {
        int nums[] = { 3, 7, 2 };
        nums[1] = 5;
        int nums1[] = new int[4];
        nums1[0] = 1;
        // System.out.println(nums[1]);
        // System.out.println(nums1[0]);
        for (int i = 0; i < 3; i++) {
            System.out.println(nums[i]);

        }
    }
}
