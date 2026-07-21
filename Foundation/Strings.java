package Foundation;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String firstName = "Ritvik";
        String lastName = new String("Verma");

        // joining two strings

        System.out.println(firstName + " " + lastName);

        // printing length of string

        System.out.println(firstName.length());

        // printing character at a desired index

        System.out.println(firstName.charAt(0));

        // checking if pointing to the same string pool

        System.out.print("Checking if pointing to the same string pool: ");
        String name1 = "Ritvik";
        String name2 = "RITVIK";
        if (name1 == name2){
            System.out.println("Pointing to same string pool");
        }
        else {
            System.out.println("Not pointing to the same string pool");
        }

        // checking if strings are equal (case sensitive)

        System.out.print("Checking if strings are equal (case sensitive): ");
        if (name1.equals(name2)){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }

        // checking if strings are equal (ignoring case)

        System.out.print("Checking if strings are equal (ignoring case): ");
        if (name1.equalsIgnoreCase(name2)){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }

        // inputting string using next and nextline methods

        Scanner sc = new Scanner(System.in);
        System.out.print("Provide input for string content: ");
        String str = sc.next();
        System.out.println("Value for next: " + str);
        System.out.print("Provide input for string content: ");
        String str2 = sc.nextLine();
        System.out.println("Value for nextLine: " + str2);
        sc.close();

        // java string methods

        String str3 = new String("  Ritvik   Verma");

        System.out.println(str3.length());

        // isEmpty tells only if it is empty

        System.out.println(str3.isEmpty());

        // isBlank also gives true if there are only black spaces

        System.out.println(str3.isBlank());

        System.out.println(str3.length());
        name1 = str3.trim();
        System.out.println(name1);
        System.out.println(name1.length());

        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());

        // beginIndex = inlcusive
        // endIndex = exclusive

        System.out.println(str3.substring(3,6));
        System.out.println(str3.contains("Ritvik"));

        // converting integer to string

        int num = 5123;
        String str4 = String.valueOf(num);
        System.out.println(num + 1);
        System.out.println(str4 + 1);

        // checking if string has something as suffix or prefix

        System.out.println(str3.startsWith(" "));
        System.out.println(str3.endsWith("&"));

        // convert string to charactrer array

        String name5 = "Ritvik";
        char[] crr = name5.toCharArray();

        for (char ch : crr){
            System.out.println("Value of char: " + ch);
        }

        // splitting the string with a delimiter

        String input = "My,name,is,ritvik";
        String[] words = input.split(",");
        for (String stri : words){
            System.out.println(stri);
        }

        // replace oldChar with newChar

        String old = "Ritvik";
        String newString = old.replace('i', 'k');
        System.out.println(newString);
    }
}
