package homework.arrayutil;

public class ArrayUtil {

    public int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = array[i] > max ? array[i] : max;
        }
        return max;
    }

    public int getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = array[i] < min ? array[i] : min;
        }
        return min;
    }

    public void printAll(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    public void printAllPairNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ",");
            }
        }
    }

    public void printAllOddNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + ",");
            }
        }
    }

    public int getCountForPairNumber(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int getCountForOddNumbers(int[] array) {
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count2++;
            }
        }
        return count2;
    }

    public double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}
