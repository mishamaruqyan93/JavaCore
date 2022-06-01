package homework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {


        PracticeHomework practiceHomework = new PracticeHomework();
        System.out.println(practiceHomework.getConvert(10));
        System.out.println(practiceHomework.calcAge(50));
        System.out.println(practiceHomework.nextNumber(8));
        System.out.println(practiceHomework.isSameNum(7, 6));
        System.out.println(practiceHomework.lessThanOrEqualToZero(41));
        System.out.println(practiceHomework.reverseBool(false));
        System.out.println(practiceHomework.maxLength(new int[10], new int[85]));
    }
}