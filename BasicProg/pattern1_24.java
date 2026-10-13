public class pattern1_24 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++)
        {
            // print spaces
            for(int j = 1; j <= i - 1; j++)
            {
                System.out.print(" ");
            }

            // print stars
            for(int j = 1; j <= (2 * (n - i) + 1); j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}