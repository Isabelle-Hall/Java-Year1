import java.util.Scanner;
import java.util.Random;

public class Encrypt {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Enter a 4 digit pin number to encrypt: ");
        int pin = scan.nextInt();

        String hexPin = Integer.toHexString(pin);

        int number1 = 1001 + generator.nextInt(65535);
        int number2 = 1001 + generator.nextInt(65535);

        String hexNumber1 = Integer.toHexString(number1);
        String hexNumber2 = Integer.toHexString(number2);

        System.out.println("Your encrypted pin number is " +hexNumber1 +hexPin +hexNumber2);

    }
}
