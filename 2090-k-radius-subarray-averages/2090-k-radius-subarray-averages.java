class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);

        if (k == 0) return nums; // if k = 0, average is the element itself
        if (2 * k + 1 > n) return res; // not enough elements for any window

        // Compute prefix sum array
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        // Compute averages centered at i
        for (int i = k; i < n - k; i++) {
            long total = prefix[i + k + 1] - prefix[i - k];
            res[i] = (int)(total / (2 * k + 1));
        }

        return res;
    }
}
