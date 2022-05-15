package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        //Տպեք մասիվի բոլոր էլեմենտները,
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();

        //Տպեք մասիվի ամենամեծ թիվը,
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = array[i] > max ? array[i] : max;
        }
        System.out.println(max);
        System.out.println();

        //Տպեք մասիվի ամենափոքրը թիվը,
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = array[i] < min ? array[i] : min;
        }
        System.out.println(min);
        System.out.println();

        //Տպեք մասիվի բոլոր զույգ էլեմենտները,
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ",");
            }
        }
        System.out.println();

        //Տպեք մասիվի բոլոր կենտ էլեմենտները։
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + ",");
            }
        }
        System.out.println();

        //Տպեք զույգերի քանակը։
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

        //Տպեք կենտերի քանակը
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count2++;
            }
        }
        System.out.println(count2);

        //Տպեք մասիվի բոլոր թվերի միջին թվաբանականը
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int avg = sum / array.length;
        System.out.println(avg);

        //Տպեք մասիվի էլեմենտների գումարը
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum2 += array[i];
        }
        System.out.println(sum2);

    }
}
