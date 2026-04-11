//problem: sum of all odd length sub array
// leetcode: https://leetcode.com/problems/sum-of-all-odd-length-subarrays/submissions/1975665418/?envType=problem-list-v2&envId=prefix-sum
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
    int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int totalSubarrays = (i + 1) * (n - i);
            int oddSubarrays = (totalSubarrays + 1) / 2;
            sum += arr[i] * oddSubarrays;
        }

        return sum;
    }
}
