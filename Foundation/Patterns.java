package Foundation;

public class Patterns {
    public static void main(String[] args) {

        int n = 8;
        
        // print a solid rectangle

        System.out.println("Print a solid rectangle");
        System.out.println();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // print a solid right angle triangle pattern

        System.out.println("Print a solid right angle triangle pattern");
        System.out.println();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // print a solid parallelogram

        System.out.println("Print a solid parallelogram");
        System.out.println();
        for (int i = 1; i <= n; i++){
            for (int j =1; j <= n - i; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // print an inverted right angle triangle

        System.out.println("Print an inverted right angle triangle");
        System.out.println();
        for (int i = 1; i <= n; i++){
            for (int  j = n; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // print a solid pyramid
        
        System.out.println("Print a solid pyramid");
        System.out.println();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // print an inverted solid pyramid

        System.out.println("Print an inverted solid pyramid");
        System.out.println();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i - 1; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*n - 2*i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // print a hollow rectangle

        System.out.println("Print a hollow rectangle");
        System.out.println();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= 6; j++){
                if (i == 1 || i == n){
                    System.out.print("* ");
                }
                else {
                    if (j == 1 || j == 6){
                    System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();

        // print a hollow right triangle

        System.out.println("Print a hollow right triangle");
        System.out.println();
        for (int i = 1; i <= n; i++){
            if (i == 1 || i == 2 || i == n){
                for (int j = 1; j<= i; j++){
                    System.out.print("* ");
                }
            }
            else {
                System.out.print("* ");
                for (int j = 1; j <= (i-2); j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // print a hollow pyramid

        System.out.println("Print a hollow pyramid");
        System.out.println();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            if (i == 1 || i == n){
                for (int j = 1; j <= 2*i - 1; j++){
                    System.out.print("* ");
                }
            }
            else {
                System.out.print("* ");
                for (int j = 1; j <= 2*i - 3; j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // print a pattern with pyramid and inverted pyramid both

        System.out.println("Print a pattern with pyramid and inverted pyramid both");
        System.out.println();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++){
            if (i == 1){
                continue;
            }
            for (int j = 1; j <= i - 1; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*n - 2*i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // print a pattern with hollow pyramid and inverted hollow pyramid

        System.out.println("Print a pattern with hollow pyramid and inverted hollow pyramid");
        System.out.println();
        n = 4;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            if (i == 1){
                for (int j = 1; j <= 2*i - 1; j++){
                    System.out.print("* ");
                }
            }
            else {
                System.out.print("* ");
                for (int j = 1; j <= 2*i - 3; j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            if (i == (n - 1)){
                System.out.print("* ");
            }
            else{
                System.out.print("* ");
                for (int j = 1; j <= 2*(n-i)-3; j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        // print a pattern using different types of triangles

        System.out.println("Print a pattern using different types of triangles");
        System.out.println();
        for (int i = 1; i <= n ; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for (int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i+1; j++){
                System.out.print("* ");
            }
            for (int j = 1; j <= 2*(i-1); j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // print numbers in right triangle

        n = 5;
        System.out.println("Print numbers in right triangle");
        System.out.println();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // print counting in right triangle

        int count = 1;
        System.out.println("Print counting in right triangle");
        System.out.println();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

        // print alphabets in right angle triangle

        System.out.println("Print alphabets in right angle triangle");
        System.out.println();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                int a = j;
                int b = ('A' - 1);
                int ans = a + b;
                char finalAns = (char)ans;
                System.out.print(finalAns + " ");
            }
            System.out.println();
        }

        //  print alphabets in reverse order in right triangle

        System.out.println("Print alphabets in reverse order in right triangle");
        System.out.println();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                int a = j;
                int b = ('E' + 1);
                int ans = b - j;
                char finalAns = (char)ans;
                System.out.print(finalAns + " ");
            }
            System.out.println();
        }

        // print pattern by pyramid and inverted pyramid

        n = 4;
        System.out.println("Print pattern by pyramid and inverted pyramid");
        System.out.println();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i-1; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*n - 2*i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i - 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
