class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int width = matrix[0].length;
        int low = 0;
        int hi = width * matrix.length - 1;
        while (hi >= low) {
            int mid = (hi + low) / 2;
            int midValue = matrix[mid / width][mid % width];
            if (midValue == target) return true;
            else if (midValue > target) {
                hi = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return false;

    }
}