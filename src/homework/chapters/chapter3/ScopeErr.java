package homework.chapters.chapter3;

public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {
//            int bar = 2;//sa kta compile error.
        }
    }
}
