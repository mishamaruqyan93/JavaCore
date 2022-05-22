package homework.chapter5;

public class ForEach3 {
    public static void main(String[] args) {

        int sum = 0;
        int sums[][] = new int[3][5];
        for (int i = 0; i < sums.length; i++) {
            for (int j = 0; j < sums[i].length; j++) {
                sums[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int[] x : sums) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
