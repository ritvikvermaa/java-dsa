package Foundation;

import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        
        BigInteger bg = sc.nextBigInteger();
        System.out.println("BigInteger: " + bg);

        System.out.print("Enter value for flag:");
        boolean flag = sc.nextBoolean();

        System.out.print("Enter value for shortVal:");
        Short shortVal = sc.nextShort();

        System.out.print("Enter value for floatValue:");
        float floatValue = sc.nextFloat();

        System.out.println("flag: " + flag);
        System.out.println("shortVal: " + shortVal);
        System.out.println("floatValue: " + floatValue);

        sc.close();
    }
}
