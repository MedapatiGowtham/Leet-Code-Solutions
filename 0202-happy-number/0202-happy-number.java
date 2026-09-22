class Solution {
    public boolean isHappy(int n) {
        int slow = sumOfSquares(n);
        int fast = sumOfSquares(sumOfSquares(n));
        while (slow != fast) {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        }
        return slow == 1;
    }
    private int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}