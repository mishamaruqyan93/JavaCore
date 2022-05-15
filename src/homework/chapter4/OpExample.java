package homework.chapter4;

public class OpExample {
    public static void main(String[] args) {

        // &(ev)   |(kam)  ^(xor)  ||(kam 2 hatov)
        // &&(ev2 hatov) !(jxtel)  &=(ev havasare) != (havasar che)
        // |=(kam havasare) ^=(xor havasare) ==(havasare
        // ?:ira kirarutyun@ krchat if greladzevn e

        int a = 5;

        if (a > 5 || a > 10 || a > 80) {
            System.out.println(a);
        } else {
            System.out.println("paymanin chi bavararel");
        }

        boolean bool = true;
        boolean b2 = false;
        if (bool || b2) {
            System.out.println("ok");
        }
        int x = 10;
        int y = 13;
        int z =x>y? x:y ;




        if (x>y ){
            z=x;
        }else {
            z=y;
        }
        System.out.println("z ="+ z);
    }

}
