class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // Step 1: store nums1 elements
        for (int num : nums1) {
            set1.add(num);
        }

        // Step 2: check intersection
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        // Step 3: convert set to array
        int[] res = new int[result.size()];
        int i = 0;
        for (int num : result) {
            res[i++] = num;
        }

        return res;


    }
}
