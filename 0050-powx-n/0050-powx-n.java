class Solution {
    private double power(double x, long n) {
        if (n == 0) return 1.0;
        double half = power(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
    public double myPow(double x, int n) {
        if (x == 0) return 0.0;
        if (n == 0) return 1.0;

        long exp = n;
        if (n < 0) {
            x = 1 / x;
            exp = -exp;
        }

        return power(x, exp);
    }
}