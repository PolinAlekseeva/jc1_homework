package my.tasks12_23;

public class ArrayTwo {

    public static void main(String[] args) {

        int[] nums = {6, 3, 7, 25, 5, 7, 98, 103, 87, 9};
        for(int i = 0; i< nums.length; i++) {
            if ( i% 2 == 0) {
                System.out.println(nums[i]);
            }

        }

    }
}
