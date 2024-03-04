// https://leetcode.com/problems/build-array-from-permutation/

import java.util.Arrays;
public class ArrayPermutations {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i<nums.length ;i++){
            if(nums[i] < nums.length)
                ans[i] = nums[nums[i]];
            else return new int[]{-1,-1};
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
