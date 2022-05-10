package homework.chapters.chapter3;

public class Scope {
    public static void main(String[] args) {
        int x; // ays popoxakan@ hasanesli bolor koderin main medoti mej
        x = 10;


        if (x == 10) {  //nor gorcoxutyunneri taracq(skizb)
            int y = 20; //hasaneli e miayn ays if blokum

            System.out.println("x ev y " + x + " " + y);
            x =  y * 2;
        }

        System.out.println("x havasare" + x);








    }

}

