class Solution {
    int minCost(int[] height) {
        // code here
         int n = height.length;
        int[] jp = new int[n];

        jp[n - 1] = 0;

        for (int i = n - 2; i >= 0; i--) {
            int oneStep = Math.abs(height[i + 1] - height[i]) + jp[i + 1];

            int twoStep = Integer.MAX_VALUE;
            if (i + 2 < n)
                twoStep = Math.abs(height[i + 2] - height[i]) + jp[i + 2];

            jp[i] = Math.min(oneStep, twoStep);
        }

        return jp[0];
    }
}