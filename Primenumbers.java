// Program to print the prime numbers between 2 and the given number
import java.util.*;

class Primenumbers {
    public static void main(String args[]) {
        int n, p, i, j;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        n = s.nextInt();

        System.out.println("Prime numbers between 2 and " + n + " are:");

        for (i = 2; i <= n; i++) {
            p = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0)
                    p++;
            }
            if (p == 2)
                System.out.println(i);
        }
    }
}
