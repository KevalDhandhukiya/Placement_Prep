import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
              
        int n = sc.nextInt();
        
        Map<String, Integer> latestTransactionTime = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String sender = sc.next();
            String receiver = sc.next();
            int amount = sc.nextInt();
            int timestamp = sc.nextInt();
                       
            String key = sender + "|" + receiver + "|" + amount;
          
            if (latestTransactionTime.containsKey(key)) {
                int previousTimestamp = latestTransactionTime.get(key);
                if (timestamp - previousTimestamp <= 60) {
                   
                    System.out.println(sender + " " + receiver + " " + amount + " " + timestamp);
                }
            } 
            latestTransactionTime.put(key, timestamp);
        }
   }
}