package classwork.students;

import java.util.Scanner;

public class StudentDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add student");
            System.out.println("Please input 2 for print all student");
            System.out.println("Please input 3 for see student count");
            System.out.println("Please input 4 for delete student by index");
            System.out.println("Please input 5 for print student by lessonName");
            System.out.println("Please choose 6 for change student's lesson");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    add();
                    break;
                case 2:
                    printAll();
                    break;
                case 3:
                    printCount();
                    break;
                case 4:
                    deleteByIndex();
                    break;
                case 5:
                    printStudentByLesson();
                    break;
                case 6:
                    changeLesson();
                    break;
                default:
                    System.out.println("invalid command: Please try again");
            }
        }
    }

    private static void add() {
        System.out.println("Please input student name");
        String name = scanner.nextLine();
        System.out.println("Please input student surname");
        String surname = scanner.nextLine();
        System.out.println("Please input student age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input student phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input student city");
        String city = scanner.nextLine();
        System.out.println("Please input student lesson");
        String lesson = scanner.nextLine();

        Student student = new Student(name, surname, age, phoneNumber, city, lesson);
        studentStorage.add(student);
        System.out.println("Student was added");
    }

    private static void printAll() {
        studentStorage.print();
    }

    private static void printCount() {
        System.out.println(studentStorage.getSize());
    }

    private static void deleteByIndex() {
        System.out.println("Please choose index for delete");
        printAll();
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.delete(index);
        System.out.println("Student was deleted");
    }

    private static void printStudentByLesson() {
        System.out.println("Please input lesson name");
        String lesson = scanner.nextLine();
        studentStorage.printStudentByLesson(lesson);
    }

    private static void changeLesson() {
        printAll();
        System.out.println("Please input student's index");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input lesson name");
        String lesson = scanner.nextLine();
        studentStorage.changeLesson(index, lesson);
        System.out.println("Student's lesson was changed");
    }
}