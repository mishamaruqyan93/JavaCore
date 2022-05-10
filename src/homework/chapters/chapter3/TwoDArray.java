package homework.chapters.chapter3;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] array = new int[4][5];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = k;
                k++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print(array[i][j]);

            }
            System.out.println();
        }


    }

}


