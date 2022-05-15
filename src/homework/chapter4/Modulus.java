package homework.chapter4;

public class Modulus {
    public static void main(String[] args) {

        int x = 42;
        double y = 42.25;
        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);

        int c = 66;
        double d = 53.8;
        System.out.println("c mod 5 = " + c % 5);
        System.out.println("d mod 5 = " + d % 5);

        int e = 35;
        double f = 89.75;
        System.out.println("e mod 3 = " + e % 3);
        System.out.println("f mod 8 = " + f % 8);


        int a = 5;
        a = a + 4;
        a += 4;
        int b = 6;
        b = b % 2;
        b %= 2;
        System.out.println(a+" "+b);
    }
}
