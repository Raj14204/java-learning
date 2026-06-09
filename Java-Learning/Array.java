// int num[] = {5,6,7};
// int num1[] = new int[4];
//every array will have name 
//multi-diminsional array int num2[][] = new int[3][4]
//if we don't spicfiy the numbers then it is call the jagged array int num3[][] = new int[3][]
//but after that we have to tell how many arrya we will have in the array like num3[0] = new int[2],num3[1] = new int[4],... 
public class Array {
    public static void main(String a[]) {
        // int nums[] = { 3, 7, 2 };
        // nums[1] = 5;
        // int nums1[] = new int[4];
        // nums1[0] = 1;
        // // System.out.println(nums[1]);
        // // System.out.println(nums1[0]);
        // for (int i = 0; i < 3; i++) {
        // System.out.println(nums[i]);

        // }
        int num2[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                num2[i][j] = (int) (Math.random() * 100);
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                num2[i][j] = (int) (Math.random() * 100);
                System.out.print(num2[i][j] + " ");
            }
            System.out.println();

        }

        // enhanced for loop
        for (int n[] : num2) {
            for (int m : n) {
                System.out.print(m + " ");

            }
            System.out.println();
        }
        int nums2[][] = new int[3][]; // jagged array
        nums2[0] = new int[2];
        nums2[1] = new int[4];
        nums2[2] = new int[3];
    }

}
