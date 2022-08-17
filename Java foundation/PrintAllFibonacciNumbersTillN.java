import java.util.*;

public class PrintAllFibonacciNumbersTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int f = 0;
        int s = 1;

        System.out.println(f);
        System.out.println(s);

        int c = 2;

        while (c < n) {
            int sum = f + s;
            System.out.println(sum);
            f = s;
            s = sum;
            c++;
        }
    }
}
