package homework.chapter5;

public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("takt " + n);
            n--;
        } while (n > 0);

        do {
            System.out.println("takt " + n);
        } while (--n > 0);


    }
}
