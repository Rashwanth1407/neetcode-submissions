class Solution {
    public boolean isArmstrong(int n) {
        if (n == 0) return true;  
        int original = n;
        int digitCount = 0;
        int temp = n;
        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += Math.pow(rem, digitCount);
            n /= 10;
        }
        return sum == original;
    }
}
