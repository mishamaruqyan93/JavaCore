package homework.arrayutil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 1, 9, 6};
        ArrayUtil arrayUtil = new ArrayUtil();
        System.out.println("max = " + arrayUtil.getMax(numbers));
        System.out.println("min = " + arrayUtil.getMin(numbers));
        arrayUtil.printAll(numbers);
        System.out.println();
        arrayUtil.printAllOddNumbers(numbers);
        arrayUtil.printAllPairNumbers(numbers);
        System.out.println(arrayUtil.getCountForPairNumber(numbers));
        System.out.println(arrayUtil.getCountForOddNumbers(numbers));
        System.out.println(arrayUtil.getAverage(numbers));
    }
}
