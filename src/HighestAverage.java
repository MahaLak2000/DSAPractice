import java.util.*;

public class HighestAverage {

        public static void main(String[] args) {
            // Input data: student names and their corresponding marks
            String[][] studentMarks = {
                    {"Charles", "84"},
                    {"John", "100"},
                    {"Andy", "37"},
                    {"John", "23"},
                    {"Charles", "90"}
            };


            Map<String , List<Integer>> map=new HashMap<>();
            for(String[] st: studentMarks)
            {
                String student =st[0];
                int marks= Integer.parseInt(st[1]);
                map.putIfAbsent(student, new ArrayList<>());
                map.get(student).add(marks);

            }
            String highestStudent="";
            double highestAverage=0.0;
            for(Map.Entry<String , List<Integer>> entry:map.entrySet())
            {
                String  student= entry.getKey();
                List<Integer> scores= entry.getValue();
                int sum=0;
                for(int score:scores)
                {
                    sum=sum+score;

                }
                double avg=(double)sum/scores.size();
                if(avg>highestAverage)
                {
                    highestAverage=avg;
                    highestStudent=student;
                }


            }

            System.out.println(highestAverage +"    "+highestStudent );

        }

    }

