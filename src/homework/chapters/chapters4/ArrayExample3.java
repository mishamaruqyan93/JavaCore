package homework.chapters.chapters4;

public class ArrayExample3 {
    public static void main(String[] args) {
        int[] array = {9, 98, 78, -5, 6,100};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);

    }
}
