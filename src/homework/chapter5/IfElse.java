package homework.chapter5;

public class IfElse {
    public static void main(String[] args) {
        int mount = 4; //april
        String season;
        if (mount == 12 || mount == 1 || mount == 2) {
            season = " dzmer";
        } else if (mount == 3 || mount == 4 || mount == 5) {
            season = "garun";
        } else if (mount == 6 || mount == 7 || mount == 8) {
            season = "amar";
        } else if (mount == 9 || mount == 10 || mount == 11) {
            season = "ashun";
        } else {
            season = " вымышленный месяц";
        }
        System.out.println("April@ verabervum e " + season + ".");


        int i = 10;
        if (i < 0) {
            System.out.println(false);
        } else if (i == 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }


        String[] arr = {"mihran", "misho", "valod"};


        boolean b = false;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == "valod2") {
                b = true;
                System.out.println(b);
            } else {
                System.out.println(b);
            }
        }
    }
}

