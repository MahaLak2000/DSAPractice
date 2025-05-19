public class Factorial {


        public static void main(String[] args) {
            int n=10;
            int fact=1;
            if(n<0)
            {
                System.out.println("not a positive number");
            }else{

                for(int i=n;i>0;i--)
                {
                    fact=fact*i;
                }

            }
            System.out.println(fact);
        }

    }



