public class MinDistBetweenTwoWords {


        public static int minDistance(String sentence, String word1, String word2) {
            String[] words = sentence.split(" ");
            int index1 = -1, index2 = -1;
            int minDistance = Integer.MAX_VALUE;

            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(word1)) {
                    index1 = i;
                } else if (words[i].equals(word2)) {
                    index2 = i;
                }

                // If both words have been seen, update the minimum distance
                if (index1 != -1 && index2 != -1) {
                    int distance = Math.abs(index1 - index2);
                    if (distance < minDistance) {
                        minDistance = distance;
                    }
                }
            }

            return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;
        }

        public static void main(String[] args) {
            String str = "the quick the brown quick brown the frog";
            String word1 = "quick";
            String word2 = "frog";

            int result = minDistance(str, word1, word2);
            System.out.println("Minimum distance between '" + word1 + "' and '" + word2 + "' is: " + result);
        }
    }


