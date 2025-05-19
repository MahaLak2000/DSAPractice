
import java.util.*;
public class MaxRepeatingIPInString {

        public static void main(String[] args) {
            String[] logs = {
                    "10.0.0.3 bytes=32 time=50ms TTL=63",
                    "10.0.0.2 bytes=32 time=50ms TTL=73",
                    "10.0.0.4 bytes=32 time=50ms TTL=83",
                    "10.0.0.3 bytes=32 time=50ms TTL=93"
            };

            Map<String, Integer> map = new HashMap<>();

            for (String log : logs) {
                String ip = log.split(" ")[0];

                map.put(ip, map.getOrDefault(ip, 0) + 1);

            }

            String maxIP = "";
            int maxCount = 0;

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    maxIP = entry.getKey();
                }
            }

            System.out.println("Most frequent IP: " + maxIP);
        }
    }


