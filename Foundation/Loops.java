package Foundation;

public class Loops {
    public static void main(String[] args) {

        // for loop

        System.out.println("For loop demonstartion: ");
        for (int i = 1; i <= 4; i++){
            System.out.println("Value of i: " + i);
        }

        for (int i = 1; i <= 10; i += 2){
            System.out.println("Value of i: " + i);
        }

        //nested loops

        System.out.println("Nested Loop Demonstration");
        for (int i = 1; i <=3; i++){
            for (int j = 1; j <=3; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 3; j++){
                System.out.println("i: " + i + ", j: " + j);
            }
        }

        // break keyword

        System.out.println("Break Keyword Demonstartion");
        for (int i = 1; i <= 10; i++){
            if (i == 5){
                break;
            }
            System.out.println(i);
        }

        // continue keyword

        System.out.println("Continue Keyword Demonstration");
        for (int i = 1; i <= 10; i++){
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }

    }
}
