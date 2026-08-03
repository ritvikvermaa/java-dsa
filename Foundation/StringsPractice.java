package foundation;

public class StringsPractice {

    // print each character of string
    static void printString(String str){
        int n = str.length();
        for (int i = 0; i < n; i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    // print length of string without using length() method
    static int getStringLength(String str){
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
    }

    // print count of vowels in a string
    static int getVowelsCount(String str){
        int n = str.length();
        int count = 0;
        for (int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }

    // print reverse of a string
    static String reverseOfString(String str){
        String reverse = "";
        int n = str.length();
        for (int i = n - 1; i >= 0; i--){
            char ch = str.charAt(i);
            reverse += ch;
        }
        return reverse;
    }

    // check if string is palindrome
    static boolean isPalindrome(String str){
        String original = str;
        String reverse = reverseOfString(original);
        int n = original.length();
        for (int i = 0; i < n; i++){
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);
            if (ch1 != ch2){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Ritvik";
        String str2 = "RACECAR";
        printString(str);
        System.out.println("Length of string: " + getStringLength(str));
        System.out.println("Vowels count: " + getVowelsCount(str));
        System.out.println("Reverse of string: " + reverseOfString(str));
        System.out.println("Is the string palindrome?: " + isPalindrome(str2));
    }
}
