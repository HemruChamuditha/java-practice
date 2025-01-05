package Inheritance;

public class Animal {

    public Animal() {
    }

    public Animal(String category, int age, String country) {
        Category = category;
        this.age = age;
        this.country = country;
    }

    private String Category;
    private int age;
    private String country;

    public void eat(){
        System.out.println("Eating");
    }

    public void run(){
        System.out.println("Running");
    }


    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
