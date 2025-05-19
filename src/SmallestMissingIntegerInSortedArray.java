public class SmallestMissingIntegerInSortedArray {


        public static int findSmallestMissing(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != i) {
                    return i; // As soon as index and value don't match, return index
                }
            }
            return arr.length; // If all match, missing number is next in sequence
        }


        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4};
            int[] arr2 = {0, 1, 3, 4};
            int[] arr3 = {0, 1, 2, 3, 4};
            int[] arr4 = {0, 1, 2, 3, 5}; // Missing 4

            System.out.println(findSmallestMissing(arr1)); // Output: 0
            System.out.println(findSmallestMissing(arr2)); // Output: 2
            System.out.println(findSmallestMissing(arr3)); // Output: 5
            System.out.println(findSmallestMissing(arr4)); // Output: 4
        }
    }


