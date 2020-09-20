import java.util.Scanner;

public class Solution {
    /**
     * print all prime numbers from 0 to $n use Sieve of Eratosthenes algorithm
     * useful link https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     * notice that print each number in a line
     * @param n
     */
    public static void primes(int n) {
        boolean[] primes = new boolean[n + 1];

        for (int i = 0; i < n + 1; i++) {
            primes[i] = true;
        }

        for (int j = 2; j * j <= n; j++) {
            if (primes[j]) {
                for (int k = j * j; k <= n; k += j) {
                    primes[k] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primes(n);
    }
}
