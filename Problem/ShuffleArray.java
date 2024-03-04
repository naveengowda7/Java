// https://leetcode.com/problems/shuffle-the-array/

import java.util.Arrays;

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for(int i =0;i<nums.length/2;i++){
            ans[2*i] = nums[i];
            ans[(2*i)+1] = nums[n+i];
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums,3)));
    }
}
