import java.util.*;

public class CountDigitsInANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int num = 0;
        while (n != 0) {
            n = n / 10;
            num++;
        }
        System.out.println(num);
    }
}
