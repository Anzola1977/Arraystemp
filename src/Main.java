import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = new int[11];
        int value = 5;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = value;
            value++;
        }
        for (int item : nums) {
            System.out.println(item);
        }
//        System.out.println(Arrays.toString(nums));
    }
}