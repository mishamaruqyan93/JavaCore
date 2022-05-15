package homework.chapter4;

public class IncDec {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        int d;
        c = ++b;
        d = a++;
        c++;
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        System.out.println("c =" + c);
        System.out.println("d =" + d);

        int z = 0;
        int x = z++;
        System.out.println(x);

        int g = 5;
        int l = ++g;
        int r = 5;
        int s = r++;
        int k = ++r;
        System.out.println("g =" + g);
        System.out.println("l =" + l);
        System.out.println("k =" + k);
        System.out.println("s =" + s);
        System.out.println("k =" + k);

    }
}
