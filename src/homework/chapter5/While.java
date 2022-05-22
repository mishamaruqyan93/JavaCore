package homework.chapter5;

public class While {
    public static void main(String[] args) {

        int n = 10;
        while (n > 0) {
            System.out.println("text " + n);
            n--;
        }
        System.out.println();

        for (int a = 10; a > 0; a--) {
            System.out.println("text " + a);
        }


        int i, j;
        i = 100;
        j = 200;

        while (++i < --j) {
            System.out.println(i);
        }

        int k = 0;
        while (k < 100) {
            if (k == 10) {
                break;
            }
            System.out.println("k:" + k);
            k++;
        }
        System.out.println("cikl@ avartvace");

    }
}
