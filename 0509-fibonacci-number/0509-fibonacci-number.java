public class Solution {
    public static int fib(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Initialize variables for F(0) and F(1)
        int prev2 = 0; // Represents F(n-2)
        int prev1 = 1; // Represents F(n-1)
        int current = 0;

        // Iteratively calculate up to n
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {
        // Test Examples from the image
        System.out.println("Input: n = 2 -> Output: " + fib(2)); // Expected: 1
        System.out.println("Input: n = 3 -> Output: " + fib(3)); // Expected: 2
        System.out.println("Input: n = 4 -> Output: " + fib(4)); // Expected: 3
    }
}
