package Foundation;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        // if statements

        int dailyPractice = 12;
        if (dailyPractice > 10){
            System.out.println("Good consistency!!");
        }

        int age = 20;
        if (age > 18){
            System.out.println("You are eligible to vote.");
        }

        // if-else statement

        int score = 60;
        if (score > 50){
            System.out.println("Pass");
        }
        else System.out.println("Fail");

        // if-else-if ladder

        int accuracy = 92;
        if (accuracy >= 90) System.out.println("Excellent");
        else if (accuracy >= 75) System.out.println("Good");
        else if (accuracy >= 60) System.out.println("Average");
        else System.out.println("Improvement");

        //nested if-else
        
        boolean hasSubscription = true;
        int solvedProblems = 220;
        if (hasSubscription){
            if (solvedProblems > 200) System.out.println("Unlock Advanced Sheet");
            else System.out.println("Practice more problems");
        } else {
            System.out.println("Upgrade to premium");
        }

        // switch case

        System.out.print("Enter day: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        sc.close();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }

    }
}
