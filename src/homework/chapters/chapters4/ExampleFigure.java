package homework.chapters.chapters4;

public class ExampleFigure {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <i + 1  ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}