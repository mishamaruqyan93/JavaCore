package homework.chapters.chapter3;

public class ConversionEx {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println(" \nПpeoбpaзoвaниe типа int в тип byte.");
        b = (byte) i;
        System.out.println(b);
        i = (int) d;
        System.out.println(i);
        b = (byte) d;
        System.out.println(b);
        }
}
