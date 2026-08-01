package OOPS;

public class Student {
    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    // Default constructor // attr -> garbage or null
    public Student(){
        System.out.println("Default constructor called!!");
    }

    // Parameterized constructor
    public Student(int id, int age, String name, int nos){
        System.out.println("Parameterized constructor called!!");
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
    }

    // Copy constructor
    public Student(Student xyz){
        System.out.println("Copy constructor called!!");
        this.id = xyz.id;
        this.age = xyz.age;
        this.name = xyz.name;
        this.nos = xyz.nos;
    }

    // Methods/Behaviours
    public void study(){
        System.out.println(name + " studying");
    }
    public void sleep(){
        System.out.println(name + " sleeping");
    }
    public void bunk(){
        System.out.println(name + " bunking");
    }
}