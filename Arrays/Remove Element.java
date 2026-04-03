// Problem: Remove Elements
// Link : https://leetcode.com/problems/remove-element/description/?envType=problem-list-v2&envId=array
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;

    }
}
