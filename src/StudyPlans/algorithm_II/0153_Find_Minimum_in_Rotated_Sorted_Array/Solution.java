class Solution {
    public int findMin(int[] nums) {
        int low = 0, hi = nums.length - 1;
        while (low < hi) {
            int mid = (low + hi) / 2;
            if (nums[hi] < nums[mid]) {
                low = mid + 1;
            } else if (nums[mid] < nums[low]) {
                hi = mid;
            } else {
                break;
            }

        }
        return nums[low];
    }
}