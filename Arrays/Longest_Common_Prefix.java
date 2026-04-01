// Problem: Longest Common Prefix
// Link: https://leetcode.com/problems/longest-common-prefix/
// Difficulty: Easy
// Approach: Horizontal Scanning
// Time Complexity: O(n * m)
// Space Complexity: O(1)

// Intuition:
// Start with first string as prefix and keep reducing it
// until it matches with all other strings.

// Approach:
// 1. Take first string as prefix
// 2. Compare it with each string
// 3. Reduce prefix until it matches
// 4. Return final prefix


class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }

        return prefix;
    }
}
