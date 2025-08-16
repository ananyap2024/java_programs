import java.util.Scanner;

public class RootsOfqe {
    public static void main(String args[]) {
        double secondRoot = 0, firstRoot = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a :");
        double a = sc.nextDouble();

        System.out.println("Enter the value of b :");
        double b = sc.nextDouble();

        System.out.println("Enter the value of c :");
        double c = sc.nextDouble();

        // Calculate the determinant
        double determinant = (b * b) - (4 * a * c);

        // Check the value of the determinant
        if (determinant > 0) {
            double sqrt = Math.sqrt(determinant);
            firstRoot = (-b + sqrt) / (2 * a);
            secondRoot = (-b - sqrt) / (2 * a);
            System.out.println("Roots are :: " + firstRoot + " and " + secondRoot);
        } else if (determinant == 0) {
            firstRoot = (-b) / (2 * a);
            System.out.println("Root is :: " + firstRoot);
        } else {
            // If the determinant is negative, calculate complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
            System.out.println("Roots are complex: " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
        }

        // Close the scanner
        sc.close();
    }
}
