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
    }
}
