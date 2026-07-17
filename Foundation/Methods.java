package Foundation;

public class Methods {

    // Unparameterized method

    static void print2Table(){
        for (int i = 1; i <= 10; i++){
            System.out.println(2 + " X " + i + " = " + 2*i);
        }
    }

    // Parameterized method

    static void sum(int x, int y){
        System.out.println(x+y);
    }

    // Method overloading

    static void sum(int x, int y, int z){
        System.out.println(x+y+z);
    }
    public static void main(String[] args) {
        System.out.println("Hi, we will be printing table of 2.");
        print2Table();
        System.out.println("Table printed succesfully.");
        sum(10,15);
        sum(10,15,20);
    }
}
