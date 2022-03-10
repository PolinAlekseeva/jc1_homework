package my.tasks12_23;

public class ArrayTwo {

    public static void main(String[] args) {

        float[] nums = {6.5f, 3.2f, 7.08f, 25.9f, 5.5f, 7.3f, 98.5f, 103.6f, 87.4f, 9.7f };
        for(int i = 0; i< nums.length; i++) {
            if ( i% 2 == 0) {
                System.out.println(nums[i]);
            }

        }

    }
}
