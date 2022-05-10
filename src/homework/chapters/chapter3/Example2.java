package homework.chapters.chapter3;

public class Example2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int l = 0; l < i + 1; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}