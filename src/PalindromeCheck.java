public class PalindromeCheck {


        public static boolean ispalindrome(String str)
        {
            if(str==null)
            {
                return false;

            }else
            {
                StringBuilder st=new StringBuilder();
                for(int i=str.length()-1;i>=0; i--)
                {
                    st.append(str.charAt(i));

                }

                if( st.toString().equals(str) )
                {
                    return true;
                }else
                {
                    return false;
                }

            }
        }
        public static void main(String[] args) {
            String str="MAHkAM";
            System.out.println(ispalindrome(str));
        }
    }

