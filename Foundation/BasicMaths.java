package foundation;

public class BasicMaths{

    static void printDigits(int num){
        while (num != 0){
            System.out.println(num % 10);
            num = num / 10;
        }
    }

    static void countDigits(int num){
        int count = 0;
        while(num != 0){
            int digit = num % 10;
            count++;
            num = num / 10;
        }
        System.out.println(count);
    }

    static int sumDigits(int num){
        int sum = 0;
        while (num != 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    static int reverseDigits(int num){
        int revNum = 0;
        while (num != 0){
            int digit = num % 10;
            revNum = revNum*10 + digit;
            num = num / 10;
        }
        return revNum;
    }

    static boolean isPalindrome(int num){
        int originalNumber = num;
        int reverseNumber = reverseDigits(originalNumber);
        if (originalNumber == reverseNumber){
            return true;
        }
        return false;
    }

    static boolean isPrime(int num){
        int count = 0;
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                count++ ;
            }
            if (count > 2){
                return false;
            }
        }
        return true;
    }

    static int getGCD(int a, int b){
        // gcd (a , b) = gcd (b , a%b)

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        int ans = a;
        return ans;
    }

    static int getLCM(int a, int b){
        int ans;
        ans = (a*b)/getGCD(a, b);
        return ans;
    }

    static boolean isAmstrong(int num){
        int ans = 0;
        int tempNum = num;
        while (tempNum != 0){
            int digit = tempNum % 10;
            ans += digit*digit*digit;
            tempNum = tempNum / 10;
        }
        if (ans == num) return true;
        else return false;
    }

    static boolean isPerfectNumber(int num){
        int ans = 0;
        for (int i = 1; i < num; i++){
            if (num % i == 0){
                ans += i;
            }
        }
        if (ans == num) return true;
        return false;
    }

    static void numberOfPrime(int num){
        for (int i = 1; i < num; i++){
            if (isPrime(i)) System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Input number is: " + num);
        System.out.println("Each digit in the number is: ");
        printDigits(num);
        System.out.print("Count of digits is: ");
        countDigits(num);
        System.out.println("Sum of digits is: " + sumDigits(num));
        System.out.println("Reverse of given number is: " + reverseDigits(num));
        System.out.println("Given number is Palindrome: " + isPalindrome(num));
        System.out.println("Given number is prime: " + isPrime(num));
        System.out.println("GCD of 12 and 18 are: "+ getGCD(12, 18));
        System.out.println("LCM of 12 and 18 are: "+ getLCM(12, 18));
        System.out.println("Given number is amstrong number: " + isAmstrong(num));
        System.out.println("Given number is perfect number: " + isPerfectNumber(num));
        System.out.print("Prime numbers from 1 to " + num + " are: ");
        numberOfPrime(num);
    }
}