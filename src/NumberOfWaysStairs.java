public class NumberOfWaysStairs {

        static int countWays(int n) {
            if (n == 0 || n == 1)
                return 1;

            return countWays(n - 1) + countWays(n - 2);
        }

        public static void main(String[] args) {
            int n = 10;
            System.out.println(countWays(n));  // Output: 5
        }
    }


