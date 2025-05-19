public class AtaoiFunction {

        public static int customAtoi(String str) {
            if (str == null || str.isEmpty()) return -1;

            int result = 0;
            int startIndex = 0;
            boolean isNegative = false;

            // Check if the string starts with '-'
            if (str.charAt(0) == '-') {
                isNegative = true;
                startIndex = 1;
            }

            // Parse each character
            for (int i = startIndex; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch < '0' || ch > '9') {
                    return -1; // invalid character found
                }
                result = result * 10 + (ch - '0');
                //  result = result * 10 + (Integer.parseInt(String.valueOf(ch)));
//result = result * 10 + Character.getNumericValue(ch);

            }

            return isNegative ? -result : result;
        }

        public static void main(String[] args) {
            System.out.println(customAtoi("123"));     // 123
            System.out.println(customAtoi("-123"));    // -123
            System.out.println(customAtoi("1a23"));    // -1
            System.out.println(customAtoi(""));        // -1
            System.out.println(customAtoi(null));      // -1
        }
    }


