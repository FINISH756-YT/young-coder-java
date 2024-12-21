import figures.Triangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Triangle rectangle = new Triangle(10, 20);
        int area = rectangle.getArea();
        System.out.println("Area is " + area);
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 10; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//
//        myMethod();
//        myMethod3();
//        myMethod5();
//        String y = myMethod();
    }

    static String myMethod() {
        int x = 2 + 3;
        System.out.println("Hi");
        System.out.println("How?");
        System.out.println("x");
        return "null";
    }

    static void myMethod5() {
        int y = 7 + 9;
        System.out.println("Good");
        System.out.println("9");
    }
    static void myMethod3()  {
        int z = 5 + 5;
        System.out.println("By");
        System.out.println("Heloo");
    }
}