
import java.util.*;
public class FormWordsFromInput {


        public static List<String> formWordsFromInput(String[] str,String  input) {
            List<String> al=new ArrayList<>();
            char inp[]= input.toCharArray();
            Arrays.sort(inp);
            String sortedInput = new String(inp);
            for(String st:str)
            {
                if(st.length()>=input.length())
                {
                    char[] word= st.toCharArray();
                    Arrays.sort(word);
                    String Sortedword=new String(word);
                    if(Sortedword.equals(sortedInput))
                    {

                        al.add(st);
                    }

                }
            }
            return al;
        }

        public static void main(String[] args) {

            String[] dict1 = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
            String input1 = "abcd";
            System.out.println(formWordsFromInput(dict1, input1)); // Output: [abcd, bcad]

            String[] dict2 = {"ab", "abcd", "bcdaf", "bcad", "acaab", "acab"};
            String input2 = "caab";
            System.out.println(formWordsFromInput(dict2, input2)); // Output: [acab]
        }
    }

