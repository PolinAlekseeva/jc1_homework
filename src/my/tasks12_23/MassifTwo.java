package my.tasks12_23;

public class MassifTwo {

    public static void main(String[] args) {

        int[] nums = {3,5,7,1,0,8,9,11,17,4};
        for (int i = 0;i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        int n = nums.length;
        int mas;
        for (int i = 0; i < n/2; i++){
            mas = nums[n-i-1];
            nums[n-i-1] = nums[i];
            nums[i] = mas;
        }

        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
