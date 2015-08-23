package ExceptionHandling;

/**
 * Created by nithyapari on 8/22/15.
 */
public class ExceptionHandle {

    public static void main(String[] args) {

        //Calling Method 1
        method1();
        System.out.println("Line after Exception - Main");
    }
    private static void method1() {

        //Calling Method 2
        method2();
        System.out.println("Line after Exception - Method 1");
    }

    private static void method2() {
        try {
            String str = null;
            str.toString();
            System.out.println("Line after Exception - Method 2");
        }
        catch (Exception e) {
            System.out.println("Exception Handled - Method 2");
        }
    }
}
