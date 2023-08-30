import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (isPrime(x)) {
            System.out.println(x + " is prime number");
        } else {
            System.out.println(x + " is a non-prime number");
        }
    }

    static boolean isPrime(int x) {
        if (x <= 1)
        {
            return false;
        }
        for (int i = 2; i <= x/2; i++)
        {
            if ((x % i == 0))
                return false;
        }
        return true;
    }
}
