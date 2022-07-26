package homeworkcollection;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        String[] seasons = {"winter", "spring", "summer", "autumn"};
        List<String> numbers = new LinkedList<>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add("five");
        numbers.add("six");

        List<String> list = arrayToList(seasons);
        Set<String> strings = listToSet(numbers);
        printFirstFive(numbers);
        System.out.println(sizeOfList(numbers));
        removeByInd(list, 1);
    }

    //մեթոդը գրել այնպես, որ կանչենք, ու իրան ստրինգների մասիվ տանք, ինքը վերադարձնի նույն էլեմենտներով ArrayList
    static List<String> arrayToList(String[] values) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String value : values) {
            arrayList.add(value);
        }
        return arrayList;
    }

    //մեթոդը գրել այնպես, որ կանչենք ու տանք ինչ որ լիստ, ու ինդեքս, ինքը ջնջե էդ ինդեքսի տակ գտնվող էլեմենտը, ու վերադարձնե նույն լիստը, առանց էդ էլեմենտի։
    static List<String> removeByInd(List<String> list, int index) {
        list.remove(index);
        return list;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած String-ների լիստ, վերադարձնի նույն արժեքներով HashSet
    static Set<String> listToSet(List<String> list) {
        return new HashSet(list);
    }

    // մեթոդը գրել այնպես, որ ինչ մեծությամբ լիստ էլ տանք էս մեթոդին, ինքը տպե մենակ սկզբի 5 հատը։
    static void printFirstFive(List<String> list) {
        int index = 0;
        while (index != 5) {
            System.out.println(list.get(index));
            index++;
        }
    }

    // մեթոդը գրել այնպես, որ ինչ list տանք վերադարձնի թե քանի էլեմենտ կա էդ լիստ-ի մեջ
    static int sizeOfList(List<String> list) {
        return list.size();
    }
}
