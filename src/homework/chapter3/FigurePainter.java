package homework.chapter3;

public class FigurePainter {
    public static void main(String[] args) {
        //Figure1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Figure2
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >i ; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Figure3
        for (int i = 0; i <5 ; i++) {
            for (int j = 5; j >i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
