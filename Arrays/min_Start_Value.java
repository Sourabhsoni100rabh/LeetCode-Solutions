//problem min_start-value
// difficulty easy
// approach prefix sum
//https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/?envType=problem-list-v2&envId=prefix-sum
class Solution {
    public int minStartValue(int[] nums) {
       int sum = 0;
        int minSum = 0;

        for(int num : nums){
            sum += num;
            minSum = Math.min(minSum, sum);
        }

        return 1 - minSum;
    }
}
