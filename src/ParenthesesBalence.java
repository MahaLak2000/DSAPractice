public class ParenthesesBalence {

        public static boolean isBalanced(String str) {
            int balance = 0;
            for (char ch : str.toCharArray()) {
                if (ch == '(') {
                    balance++;
                } else if (ch == ')') {
                    balance--;
                    if (balance < 0) return false; // more ')' than '('
                }
            }
            return balance == 0;
        }

        public static void main(String[] args) {
            String input = "()()((()))";
            System.out.println("Is balanced? " + isBalanced(input));
        }
    }

