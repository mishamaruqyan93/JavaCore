package homework.arrayutil;

public class ArraySort {
    public static void main(String[] args) {
        //  գրենք կոդ, որը մասիվի էլեմենտները կդասավորի մեծից փոքր։
        //  Այիսինքն մեր լոգիկան աշխատելուց հետո որ մասիվի բոլոր էլեմենտները տպենք,
        //  պետք է դասավորած աճման կարգով տպի բոլոր էլեմենտները։
        //  Սա ստացվելուց հետո մի հատ էլ նվազման կարգով դասավորեք։


        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};


        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + ",");
        }
        System.out.println();

        int temp2;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp2 = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp2;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + ",");
        }

        System.out.println();

        //Պետք է ստեղծել նոր՝ char[] result մասիվ, որտեղ չեն լինի spaceArray-ի սկզբի և վերջի բացատները։
        // Այսինքն մեր լոգիկայի արդյունքում որ տպենք result մասիվի բոլոր էլեմենտները՝ կունենանք cat b i b
        // (մեջտեղի սինվոլները մնալու են)

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int start = 0;
        int end = spaceArray.length - 1;
        while (spaceArray[start] == ' ') {
            start++;
        }
        while (spaceArray[end] == ' ') {
            end--;
        }
        char[] result = new char[start + end - 1];
        int indexOf = 0;
        for (int i = start; i <= end; i++) {
            result[indexOf] = spaceArray[i];
            indexOf++;
        }

        for (char x : result) {
            System.out.print(x);
        }
    }
}
