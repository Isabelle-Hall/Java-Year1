import java.util.Scanner;
public class Reverse {
    public static void main (String[] args)
    {
        String inputOriginal, inputReverse;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence to reverse: ");
        inputOriginal = scan.nextLine();
        inputReverse = "";

        for (int i = 0; i < inputOriginal.length(); i++ ) inputReverse = inputOriginal.charAt(i) + inputReverse;

        System.out.println(inputReverse);

    }

}
