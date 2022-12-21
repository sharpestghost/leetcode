class Solution {

    //should be replaced by a solution w/ binary search
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[] {-1, -1};
        boolean isElementFound = false;
        for (int i = 0; i < nums.length; i++) {
            if (target < nums[i]) break;
            if (target == nums[i]) {
                result[1] = i;
                if (!isElementFound) {
                    result[0] = i;
                    isElementFound = true;
                }
            }
        }
        return result;
    }

}