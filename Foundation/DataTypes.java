package Foundation;

public class DataTypes {
  public static void main(String[] args) {
    
    // Numeric Data Types

    byte num1 = 127;
    System.out.println(num1);

    short num2 = 32767;
    System.out.println(num2);

    int num3 = 50000;
    System.out.println(num3);

    long num4 = 734492778;
    System.out.println(num4);

    // Floating Data Types

    float num5 = 3.146578f;
    System.out.println(num5);

    double num6 = 3.146589268474883;
    System.out.println(num6);

    // Other - Char, Boolean

    boolean eligibleToVote = true;
    System.out.println(eligibleToVote);

    char firstCharacter = 'a';
    System.out.println("My first character is " + firstCharacter);

    // Implicit Type Casting

    byte oldNum = 15;
    int newNum = oldNum;
    System.out.println("New Number: " + newNum);

    // Explicit Type Casting

    long value1 = 378929647;
    int value2 = (int)value1;
    System.out.println("New Value: " + value2);

  }
}
