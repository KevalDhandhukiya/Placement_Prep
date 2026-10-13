import java.util.Scanner;

public class Problem2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int months = sc.nextInt();
        int cost = 0;
        while (months > 0) {
            if (months >= 12) {
                cost += 15000;
                months -= 12;
            } else if (months >= 9) {
                cost += 12000;
                months -= 9;
            } else if (months >= 6) {
                cost += 9000;
                months -= 6;
            } else if (months >= 3) {
                months -= 3;
                cost += 5000;
            } else {
                cost += 2000;
                months -= 1;
            }
        }
        System.out.println("Minimum cost : "  + cost);
    }  
}