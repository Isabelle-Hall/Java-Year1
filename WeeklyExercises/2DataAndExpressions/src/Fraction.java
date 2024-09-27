import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {

        System.out.println("Provide a numerator and denominator and I will calculate the decimal equivalent!");
        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter numerator: ");
        int numerator = Scan.nextInt();

        System.out.println("Enter denominator: ");
        int denominator = Scan.nextInt();

        double result = (double) numerator / denominator;
        System.out.println("Decimal equivalent is " + result);

    }
}

