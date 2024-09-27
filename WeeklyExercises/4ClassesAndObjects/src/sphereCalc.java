import java.util.Scanner;

public class sphereCalc {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the sphere: ");
        double radius = scan.nextDouble();

        double volume = (4 *  Math.PI * Math.pow(radius, 3)) /3;
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        System.out.printf("Volume of the sphere is %.4f\n", volume);
        System.out.printf("Surface area of the sphere is %.4f\n", surfaceArea);

    }
}
