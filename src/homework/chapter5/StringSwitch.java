package homework.chapter5;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "erku";
        switch (str) {
            case "mek":
                System.out.println("mek");
                break;
            case "erku":
                System.out.println("erku");
                break;
            case "ereq":
                System.out.println("ereq");
                break;
            default:
                System.out.println(" chhamnkav");
                break;
        }


        int a = 4;
        switch (a) {
            case 1:
                System.out.println("a = 1");
                break;
            case 2:
                System.out.println("a = 2");
                break;
            case 3:
                System.out.println("a = 3");
            case 4:
                System.out.println(" a = 4");
                break;
            case 5:
                System.out.println("a = 5");
                break;
            default:
                System.out.println("default");
        }

        String b = null;
        if (b==null){
            System.out.println(b);
        }
        String str1 =null;
        if (str1.length() ==0|| str1.isEmpty() || str1==null){
        }
    }
}
