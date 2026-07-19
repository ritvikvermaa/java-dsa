package Foundation;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // int brr[] = {10,20,30};

        // // use of for loop for traversal

        // System.out.println("Use of for loop for traversal");
        // for (int i = 0; i <= brr.length - 1; i++){
        //     System.out.println("Value at " + i + " index: " + brr[i]);
        // }

        // // use of for each loop for traversal

        // System.out.println("Use of for each loop for traversal");
        // for (int val : brr){
        //     System.out.println(val);
        // }

        // // printing each element

        // System.out.println("Printing each element");
        // System.out.println("Value at 0 index: " + brr[0]);
        // System.out.println("Value at 1 index: " + brr[1]);
        // System.out.println("Value at 2 index: " + brr[2]);

        // // taking input in an array

        // System.out.println("Taking input in an array");
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < arr.length; i++){
        //     System.out.print("Enter element for " + i + " index: ");
        //     arr[i] = sc.nextInt();
        // }
        // sc.close();

        // // printing the outputed array

        // System.out.println("Your array contains: ");
        // for (int val : arr){
        //     System.out.println(val);
        // }

        // // printing the sum of all elements in an array

        System.out.println("Printing the sum of all elements in an array");
        int newArr[] = {10,20,30,40,50};
        int sum = 0;
        for (int val : newArr){
            sum += val;
        }
        System.out.println("The sum of all elements: " + sum);
        System.out.println();

        // print the product of all elements in an array

        System.out.println("Print the product of all elements in an array");
        int ans = 1;
        for (int val : newArr){
            ans *= val;
        }
        System.out.println("The product of all elements: " + ans);
        System.out.println();

        // print the maximum value in an array

        System.out.println("Print the maximum value in an array");
        int max = newArr[0];
        for (int val : newArr){
            if (val > max){
                max = val;
            }
        }
        System.out.println("The maximum value in this array: " + max);
        System.out.println();

        // print the minimum value in an array

        System.out.println("Print the minimum value in an array");
        int min = newArr[0];
        for (int i = 0; i < newArr.length; i++){
            if (newArr[i] < min){
                min = newArr[i];
            }
        }
        System.out.println("The minimum value in this array: " + min);
        System.out.println();

        // 2D array

        System.out.println("Declaration, inirialization and allocation of 2D array");
        int[][] brr = {
            {1,2},
            {2,3},
            {3,4},
            {4,5}
        };
        int rowLength = brr.length;;
        int colLength = brr[0].length;

        for (int row = 0; row < rowLength; row++){
            for (int col = 0; col < colLength; col++){
                System.out.println("The value at " + row + " and " + col + " is: " + brr[row][col]);
            }
        }
        System.out.println();

        // print a 2D jagged array

        System.out.println("Print a 2D jacked array");
        int[][] arr = {
            {2,4,5,3},
            {4,5},
            {4,6,3,2,6,8},
            {5,7,3}
        };
        int rowLength2 = arr.length;
        for (int row = 0; row < rowLength2; row++){
            int colLength2 = arr[row].length;
            for (int col = 0; col < colLength2; col++){
                System.out.println("The value at " + row + " and " + col + " is: " + arr[row][col]);
            }
        }
        System.out.println();

        // print a 2d jaggered array with each element in a row in a single line

        System.out.println("Print a 2d jaggered array with each element in a row in a single line");
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // inputting in 2D array

        System.out.println("Inputting in 2D array");
        int[][] arrForInput = new int[3][4];
        Scanner sc = new Scanner(System.in);
        for(int row = 0; row < arrForInput.length; row++){
            for(int col = 0; col < arrForInput[row].length; col++){
                System.out.print("Enter element for " + row + " and " + col + ": ");
                arrForInput[row][col] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Your inputted array is: ");
        for (int row = 0; row < arrForInput.length; row++){
        for (int col = 0; col < arrForInput[row].length; col++){
            System.out.print(arrForInput[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // print the sum of all elements in 2d array

        System.out.println("Print the sum of all elements in 2d array");
        int sum2 = 0;
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                sum2 += arr[row][col];
            }
        }
        System.out.println("The sum of all elements: " + sum2);
        System.out.println();

        // print the product of all elements in 2d array

        System.out.println("Print the product of all elements in 2d array");
        int product = 1;
        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                product *= arr[row][col];
            }
        }
        System.out.println("The product of all elements: " + product);

        // print the maximum value in 2d array

        System.out.println("Print the maximum value in 2d array");
        int max2 = arr[0][0];
        for (int row = 0; row < arr.length; row++){
            for ( int col = 0; col < arr[row].length; col++){
                if (max2 < arr[row][col]){
                    max2 = arr[row][col];
                }
            }
        }
        System.out.println("The maximum element is: " + max2);
        System.out.println();

        // print the minimum value in 2d array

        int min2 = arr[0][0];
        System.out.println("Print the minimum value in 2d array");
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (min2 > arr[row][col]){
                    min2 = arr[row][col];
                }
            }
        }
        System.out.println("The minimum element is: " + min2);
        System.out.println();
    }
}
