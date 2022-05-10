package homework.chapters.chapter3;

public class TwoAgain {
    public static void main(String[] args) {
        int[][] twoD = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];
        int k = 0;
        for (int i = 0; i < twoD.length ; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                twoD[i][j]=k;
                k ++;
            }
        }
        for (int t = 0; t < twoD.length; t++) {
            for (int i = 0; i < twoD[t].length; i++) {
                System.out.print(twoD[t][i]+ " ");
            }
            System.out.println();
        }


    }
}


