package homework.chapter4;

public class Ternary {
    public static void main(String[] args) {

        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.print("bacardzak nshanakutyun@");
        System.out.println(i + "havasare " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.print("bacarcak nshanakutyun@");
        System.out.println(i + "havasare " + k);


        int a, b, j;
        a = 20;
        b = 30;
        j = a > b | a < b ? b : -b;// ? ic aj ashxatum e true-i demqum, hakarak demqum : ic het e ashxatum
        System.out.println(j);

        int e, r, c;
        e = 50;
        r = 65;
        c = e>r? r: -r;
        System.out.println(r);

    }
}
