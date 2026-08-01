package OOPS;

public class App {
    public static void main(String[] args) {

        // Default constructor call
        // Student A = new Student();
        // A.id = 1;
        // A.name = "Ritvik";
        // A.age = 20;
        // A.nos = 7;
        // System.out.println(A.id);
        // System.out.println(A.name);
        // System.out.println(A.age);
        // System.out.println(A.nos);
        // A.bunk();
        // A.sleep();
        // A.study();

        //Parameterized constructor call
        Student A = new Student(1, 20, "Ritvik", 7);
        Student B = new Student(2, 20, "Bhotika", 8);
        System.out.println(A.id);
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.nos);
        A.bunk();
        A.sleep();
        A.study();
        System.out.println(B.id);
        System.out.println(B.name);
        System.out.println(B.age);
        System.out.println(B.nos);
        B.sleep();
        B.study();

        // Copy constructor call
        // Student B = new Student(A);
        // System.out.println(B.id);
        // System.out.println(B.name);
        // System.out.println(B.age);
        // System.out.println(B.nos);
        // B.bunk();
        // B.sleep();
        // B.study();
    }
}
