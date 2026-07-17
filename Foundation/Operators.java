package Foundation;
public class Operators{
    public static void main(String[] args) {

    // Arithmetic Operators
    int solvedThisWeek = 10;
    int solvedLastWeek = 2;
    int total = solvedLastWeek + solvedThisWeek;
    int difference = solvedThisWeek + solvedLastWeek;
    int projected = solvedThisWeek * 4;
    int average = solvedThisWeek / 7;
    int remainder = solvedThisWeek % 7;
    System.out.println(total);
    System.out.println(difference);
    System.out.println(projected);
    System.out.println(average);
    System.out.println(remainder);
    
    // Relational Operators

    int currentStreak = 45;
    int targetStreak = 50;

    System.out.println(currentStreak == targetStreak);
    System.out.println(currentStreak != targetStreak);
    System.out.println(currentStreak > targetStreak);
    System.out.println(currentStreak < targetStreak);
    System.out.println(currentStreak >= targetStreak);
    System.out.println(currentStreak <= targetStreak);

    // Logical Operators

    boolean completedDSA = true;
    boolean completedCore = false;

    System.out.println(completedDSA && completedCore);
    System.out.println(completedDSA || completedCore);
    System.out.println(!completedCore);
    
    // Assignment Operators

    int ratingPoints = 100;

    ratingPoints += 20;  // ratingPoints = ratingPoints + 20
    System.out.println(ratingPoints);
    ratingPoints -= 10;  // ratingPoints = ratingPoints - 10
    System.out.println(ratingPoints);
    ratingPoints *= 2;   // ratingPoints = ratingPoints * 2
    System.out.println(ratingPoints);
    ratingPoints /= 4;   // ratingPoints = ratingPoints / 4
    System.out.println(ratingPoints);
    ratingPoints %= 30;  // ratingPoints = ratingPoints % 30
    System.out.println(ratingPoints);


    // Unary Operators

    int activeUsers = 100;
    int prefix = ++activeUsers;
    int postfix = activeUsers++;

    System.out.println(prefix);
    System.out.println(postfix);
    System.out.println(activeUsers);


    // Ternary Operator

    int age = 20;
    String result = (age>=18) ? "Adult" : "Minor";
    System.out.println(result);

    // Print max using ternary

    int a = 20;
    int b = 15;
    int max = (a > b) ? a : b;
    System.out.println(max);

    // Even or Odd using ternary

    int num = 10;
    String evenOrOdd = (num % 2 == 0) ? "Even" : "Odd";
    System.out.println(evenOrOdd);

    }
}