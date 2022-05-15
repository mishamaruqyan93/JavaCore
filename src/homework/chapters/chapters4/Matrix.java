package homework.chapters.chapters4;

public class Matrix {
    public static void main(String[] args) {
        double m[][] = {

                {0 * 0, 1 * 0, 2 * 0, 3 * 0},
                {
                        0 * 1, 1 * 1, 2 * 1, 3 * 1},
                {0 * 2, 1 * 2, 2 * 2, 3 * 2
                },
                {0 * 3, 1 * 3, 2 * 3, 3 * 3
                },
        };

        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        int treeD[][][] = new int[3][4][5];
        int k;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    treeD[i][j][k] = i * j * k;
                }
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    System.out.print(treeD[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        int[] a1 = new int[3];
        int a2[] = new int[3];
        char twod1[][] = new char[3][4];
        char[][] twod2 = new char[3][4];

        int[] nums, nums2,nums3;//3 masiv sarqecinq
        int num[]; int num2[]; int num3[];//3 masiv sarqecinq


        String str =(" teqstayin bar e");
        System.out.println(str);

    }
}