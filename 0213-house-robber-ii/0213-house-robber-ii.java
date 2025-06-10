class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int roba = 0;
        int noroba = 0;
        for (int i = 0; i < n - 1; i++) {
            int newrob = noroba + nums[i];
            noroba = Math.max(noroba, roba);
            roba = newrob;
        }

        int robb = 0;
        int norobb = 0;
        for (int i = 1; i < n; i++) {
            int newrob = norobb + nums[i];
            norobb = Math.max(norobb, robb);
            robb = newrob;
        }

        return Math.max(Math.max(roba, noroba), Math.max(robb, norobb));
    }
}
