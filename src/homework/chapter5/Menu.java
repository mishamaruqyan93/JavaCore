package homework.chapter5;

import java.io.IOException;

public class Menu {
    public static void main(String[] args) throws IOException {
        char choice;
        do {
            System.out.println(" spravka po operatoru");
            System.out.println("     1.if");
            System.out.println("     2.switch");
            System.out.println("     3.while");
            System.out.println("     4.do-while");
            System.out.println("     5.for/n");
            System.out.println(" @ntreq hamapatasxan punkt@");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("if:\n");
                System.out.println(" if operator");
                System.out.println("else operator");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println(" switch ( выpaжeниe ) {");
                System.out.println("case constanta");
                System.out.println("operatornei hertakanutyun@");
                System.out.println("break");
                System.out.println("//...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("while:\n");
                System.out.println("while ( ycлoвиe ) оператор ; ");
                break;
            case '4':
                System.out.println(" do-while :\n");
                System.out.println("do {");
                System.out.println(" operator");
                System.out.println("} while(payman);");
                break;
            case '5':
                System.out.println("for:\n");
                System.out.println("for(inicializacia; payman; inkrementacia)");
                System.out.println("operator");
                break;
        }
    }
}
