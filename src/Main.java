import Inheritance.Cat;
import encapsulations.Student;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.eat();
        cat.run();
        cat.setAge(45);
        cat.setCategory("big cat");

        System.out.println(cat.getAge());


    }
}