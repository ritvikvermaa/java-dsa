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

        // while loop

        System.out.println("While loop demonstration");
        int i = 1;
        while (i <= 5){
            System.out.println(i);
            i++;
        }

        // nested while loop

        System.out.println("Nested while loop demonstration");
        int k = 1;
        while (k <= 2){
            int j = 1;
            while (j <= 3){
                System.out.println("k: " + k + ", j: " + j);
                j++;
            }
            k++;
        }

        // do-while loop

        System.out.println("Do-while loop demonstration");
        int iterator = 1;
        do {
            System.out.println(iterator);
            iterator++;
        } while (iterator <= 0);

    }
}
