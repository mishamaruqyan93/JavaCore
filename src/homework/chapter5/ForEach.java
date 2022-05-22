package homework.chapter5;

public class ForEach {
    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);

        int sum2 = 0;
        for (int x : nums) {
            sum2 += x;
        }
        System.out.println(sum);

        int sum3 = 0;
        for (int x : nums) {
            System.out.println("elementner@" + x);
            sum3 += x;
            if (x == 5) {
                break;
            }
        }
        System.out.println("araji 5 elementneri gumar@ havasare" + sum3);


        int nums2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : nums2) {
            System.out.print(x + " ");
            x = x * 10;
        }
        System.out.println();

        for (int x : nums2) {
            System.out.print(x + " ");
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = nums[i] * 10;
        }
        for (int i : nums2) {
            System.out.print(i + " ");
        }
    }
}
