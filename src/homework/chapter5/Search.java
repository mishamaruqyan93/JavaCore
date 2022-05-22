package homework.chapter5;

public class Search {
    public static void main(String[] args) {

        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("значение найдено" + val);
        }

        int i, j;
        for (i = 0; i < 10; i++) {
            for (j = 10; j > i; j--) {
                System.out.print(". ");
            }
            System.out.println();
        }

        int k;

        for (k = 0; k < 100; k++) {
            if (k == 10)
            {
                break;
            }
            System.out.println("k:" + k);
        }
        System.out.println(" cikl@ avartvace");
    }
}