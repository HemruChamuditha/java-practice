import staticThings.TestClass;

public class Main {

    public static void main(String[] args) {
        getMethod();
    }

    public static void getMethod(){

        TestClass testClass = new TestClass();
        System.out.println(testClass.number);
    }
}