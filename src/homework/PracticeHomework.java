package homework;

public class PracticeHomework {
    //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել
    public long getConvert(int minutes) {
        return minutes * 60;
    }

    //ընդունել տարին, վերադարձնել օրերի քանակը
    public int calcAge(int years) {
        return years * 365;
    }

    //վերադարձնել տրված թվի հաջորդ թիվը
    public int nextNumber(int number) {
        return number + 1;
    }

    //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false

    public boolean isSameNum(int a, int b) {
        boolean isTrue = false;
        if (a == b) {
            isTrue = true;
        }
        return isTrue;
    }

    //վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
    //մնացած դեպքերում վերադարձնել false


    boolean lessThanOrEqualToZero(int number) {
        boolean isTrue = false;
        if (number <= 0) {
            isTrue = true;
        }
        return isTrue;
    }

    //վերադարձնել ընդունող բուլյանի ժխտված արժեքը։
    boolean reverseBool(boolean value) {
        return !value;
    }

    //վերադարձնել երկու մասիվի ամենամեծ length-ը
    int maxLength(int[] array1, int[] array2) {
        if (array1.length > array2.length) {
            return array1.length;
        }
        return array2.length;
    }
}

