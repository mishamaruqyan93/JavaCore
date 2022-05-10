package homework.chapters.chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b-n havasar e" + b);
        b = true;
        System.out.println("b-n havasare" + b);
        if (b) {
            System.out.println("ays kod@ tpelu e");
        }
        b = false;

        if (b)
        {
            System.out.println("ays kod@ chi tpelu");
        }

        System.out.println("10>9 havasare" + (10 > 9));

    }
}
