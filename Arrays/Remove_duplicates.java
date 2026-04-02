// Problem: Remove Duplicates from Sorted Array
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Approach: Two Pointer Technique
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

class Solution {
    public int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        return j + 1;
    }
}
