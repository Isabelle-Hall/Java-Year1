import java.util.Scanner;

public class Miles_to_Kilometers {
    public static void main(String[] args)
    {
        System.out.println("Enter a distance in miles and I will calculate the equivalent in kilometers!");

        Scanner Scan = new Scanner(System.in);
        float miles, kilometers;

        System.out.println("Miles: ");
        miles = Scan.nextFloat();

        kilometers = miles * 1.60935f;

        System.out.println(miles+" miles in kilometers is "+kilometers);

    }
}
