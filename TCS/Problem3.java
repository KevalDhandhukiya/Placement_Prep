import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }
        
       
        int x = scanner.nextInt();
     
        Arrays.sort(weights);
        
        int count = 0;
        int currentWeight = 0;
        
       
        for (int i = 0; i < n; i++) {
            if (currentWeight + weights[i] <= x) {
                currentWeight += weights[i];
                count++;
            } else {
                break;
            }
        }
        
        System.out.println(count);
        
        scanner.close();
    }
}