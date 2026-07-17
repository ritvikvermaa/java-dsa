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
    
    }
}