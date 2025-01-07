package Abstractions;

public abstract class University {


    public String name;
    public String size;

    public abstract void enrollCourse();
    public void removeCourse(){
        System.out.println("Remove a subject");
    }


}
