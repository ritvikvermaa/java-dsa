package Foundation;

public class LoopsPractice {
    public static void main(String[] args) {
        
        // counting from 1 to n
        // let's say for 1 to 20

        System.out.println("Counting from 1 to 20");
        for (int i = 1; i <= 20; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        // counting from n to 1
        // let's say 20 to 1

        System.out.println("Counting from 20 to 1");
        for (int i = 20; i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        // print 10 multiples of n
        // let's say 5

        System.out.println("Print 10 multiples of 5");
        int num = 5;
        for (int i = 1; i <= 10; i++){
            System.out.print((i * num) + " ");
        }
        System.out.println();

        // print your name hundred times

        System.out.println("Print your name 100 times");
        for (int i = 0; i < 100; i++){
            System.out.print("Ritvik" + " ");
        }
        System.out.println();

        // print all prime numbers from 1 to 100

        System.out.println("Print all prime numbers from 1 to 100");
        for (int i = 1; i <= 100; i++){
            int count = 0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    count += 1;
                }
            }
            if (count == 2){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // print all even numbers from 1 to 100

        System.out.println("Print all even numbers from 1 to 100");
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // print the sum of numbers from 1 to n
        // let's say 1 to 20

        System.out.println("Print the sum of numbers from 1 to 20");
        int sum = 0;
        for (int i = 1; i <= 20; i++){
            sum += i;
        }
        System.out.println("Sum of 1 to 20 is: " + sum);

        // print all integers in range 50 to 100 divisible by 7

        System.out.println("Print all integers from 50 to 100 divisible by 7");
        for (int i = 50; i <= 100; i++){
            if (i % 7 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
