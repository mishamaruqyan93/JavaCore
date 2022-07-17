package homework.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        fileSearch();
        contentSearch();
        findLines();
        printSizeOfPackage();
        createFileWithContent();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {

        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("Please input fileName");
        String fileName = scanner.nextLine();

        File myFile = new File(path);
        if (myFile.exists()) {
            if (myFile.isDirectory()) {
                for (File file : myFile.listFiles()) {
                    if (file.getName().equals(fileName)) {
                        System.out.println(true);
                        return;
                    }
                }
                System.out.println(false);
            } else {
                System.out.println("there is no such folder in this path");
            }
        } else {
            System.out.println("Directory does not exists");
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() throws IOException {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();

        File myFile = new File(path);
        if (myFile.exists()) {
            if (myFile.isDirectory()) {
                for (File file : myFile.listFiles()) {
                    if (file.getName().endsWith(".txt")) {
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getPath()));
                        String line = "";
                        if ((line = bufferedReader.readLine()) != null) {
                            if (line.contains(keyword)) {
                                System.out.println(file.getName());
                            }
                        }
                    }
                }
            } else {
                System.out.println("there is no such folder in this path");
            }
        } else {
            System.out.println("Directory does not exists");
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() throws IOException {
        System.out.println("Please input txtPath");
        String txtPath = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();

        File myFile = new File(txtPath);

        if (myFile.exists()) {
            if (myFile.isFile()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(txtPath));
                String line = "";
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.contains(keyword)) {
                        System.out.println(line);
                    }
                }
            } else {
                System.out.println("there is no such file in this path");
            }
        } else {
            System.out.println("File does not exists");
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("Please input folderPath");
        String folderPath = scanner.nextLine();
        int size = 0;
        File myFile = new File(folderPath);
        if (myFile.exists()) {
            if (myFile.isDirectory()) {
                for (File file : myFile.listFiles()) {
                    size += file.length();
                }
            } else {
                System.out.println("there is no such folder in this path");
            }
        } else {
            System.out.println("Directory does not exists");
        }
        System.out.println(size);
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("Please input fileName");
        String fileName = scanner.nextLine();
        System.out.println("Please input content");
        String content = scanner.nextLine();

        StringBuilder newFilePath = new StringBuilder();
        newFilePath.append(path);
        newFilePath.append("\\");
        newFilePath.append(fileName);
        newFilePath.append(".txt");

        File myFile = new File(String.valueOf(newFilePath));
        if (!myFile.exists()) {
            myFile.createNewFile();
        } else {
            System.out.println("The file already exists such name");
            return;
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.valueOf(newFilePath)))) {
            bufferedWriter.write(content);
        }
    }
}
