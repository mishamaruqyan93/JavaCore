package homework.chapters.chapters4;

public class SwitchExampleFirst {
    public static void main(String[] args) {
        int a = 10;

        if (a < 10) {
            System.out.println("<");
        } else if (a > 10) {
            System.out.println(">");
        } else {
            System.out.println("=");
        }

        String name = "poxos";
        switch (name) {
            case "valod":
                System.out.println("valod");
                break;
            case "petros":
                System.out.println("petros");
                break;
            case "poxos":
                System.out.println("poxos");
                break;
            default:
                System.out.println("name-@ gtnvac che");
        }

    }
}
