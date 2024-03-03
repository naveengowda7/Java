//LeetCode Problem : 1671

// https://leetcode.com/problems/minimum-number-of-removals-to-make-mountain-array/post-solution/?submissionId=1192978689

class Solution {

  public static int minimumMountainRemovals(int[] nums) {
    int n = nums.length;
    int[] lis = new int[n];
    int[] lds = new int[n];

    for(int i =0;i<n;i++){
        lds[i] = lis[i] = 1;
    }

    // Longest Increasing Subsequence (LIS)
    for (int i = 1; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (nums[i] > nums[j] && lis[i] < lis[j] + 1)
          lis[i] = lis[j] + 1;
      }
    }

    // Longest Decreasing Subsequence (LDS)
    for (int i = n - 2; i >= 0; i--) {
      for (int j = n - 1; j > i; j--) {
        if (nums[i] > nums[j] && lds[i] < lds[j] + 1)
          lds[i] = lds[j] + 1;
      }
    }

    int ans = -1;
    for (int i = 0; i < n; i++) {
      if (lis[i] > 1 && lds[i] > 1)
        ans = Math.max(ans, lis[i] + lds[i] - 1);
    }

    return nums.length - ans;
  }
}
