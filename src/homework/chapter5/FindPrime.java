package homework.chapter5;

import static java.lang.Thread.interrupted;

public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;
        num = 14;

        if (num < 2) {
            isPrime = false;
        } else {
            isPrime = true;
        }
        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(" hasarak tiv");
        } else {
            System.out.println(" VOCH hasarak tiv");
        }

        int a, b;
        b = 4;
        for (a = 1; a < b; a++) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            b--;
        }

        for (int z = 1, x = 4; z < x; z++, x--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }


        boolean done = false;
        for (int i = 1; !done; i++) {
            if (interrupted()) done = true;
        }


    }
}