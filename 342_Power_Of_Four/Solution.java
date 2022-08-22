class Solution {
    public boolean isPowerOfFour(int n) {
        return (n > 0) ? divideOnFour(n) : false;
    }

    private boolean divideOnFour(int n) {
        return n == 1 || ((n % 4 == 0) && divideOnFour(n / 4));
    }

}