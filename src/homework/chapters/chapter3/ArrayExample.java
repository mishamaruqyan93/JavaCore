package homework.chapters.chapter3;

public class ArrayExample {
    public static void main(String[] args) {

        int[] array = {2, 3, 5, 4};
        int[] array2 = new int[4];
        int length = array.length;
        System.out.println(length);
        array2[0] = 10;
        array2[1] = 20;
        array2[2] = 30;
        array2[3] = 40;
        int index = array[3];

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array[i]);

        }

    }


}
