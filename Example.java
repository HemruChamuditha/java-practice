import java.util.Scanner;
class Example{
    public static void main(String[] args) {

callMethod();


    }

    public static void callMethod(){

        TestClass testClass = new TestClass();

        System.out.println(testClass.height);

        TestClass testClass1 = new TestClass();
        testClass1.height = 34.23;
        System.out.println(testClass1.height);
        testClass1.methodTwo();
    }

}