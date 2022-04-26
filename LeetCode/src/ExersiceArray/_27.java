package ExersiceArray;

import java.util.Arrays;

public class _27 {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;

        int n = removeElement(nums, val);
        System.out.println(n);
        System.out.println(Arrays.toString(nums));
    }
}
