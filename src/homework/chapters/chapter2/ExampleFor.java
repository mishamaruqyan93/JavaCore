package homework.chapters.chapter2;

public class ExampleFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            if(i!=0){
                if (i % 5 == 0) {
                    System.out.print("hello  ");
                }
            }

        }
    }
}

