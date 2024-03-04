// https://leetcode.com/problems/richest-customer-wealth/

import java.util.Arrays;

public class RichCustomer {

    public static int maximumWealth(int[][] accounts) {
        int[] ans = new int[accounts.length];
        int maximum = Integer.MIN_VALUE;
        for(int i =0; i<accounts.length;i++){
            int sum = 0;
            for(int j =0; j<accounts[0].length;j++){
                sum = sum + accounts[i][j];
            }
            ans[i] = sum;
        }
        for(int i =0;i< accounts.length;i++){
            maximum = Math.max(maximum,ans[i]);
        }
        return maximum;
    }

    public static void main(String[] args){
        int[][] nums = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(nums.length);
        System.out.println(maximumWealth(nums));
    }
}
