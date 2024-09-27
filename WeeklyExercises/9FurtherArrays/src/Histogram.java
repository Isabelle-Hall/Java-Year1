import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {

        int[] valueFrequency = new int[10];

        Scanner scan = new Scanner(System.in);

        int count = 0;
        System.out.println("Enter values between 1 and 100 inclusive: ");
        while (count < 10) {
            if (scan.hasNextInt()) {
                int value = scan.nextInt();
                if (value >= 1 && value <= 100) {
                    int range = (value - 1) / 10;
                    valueFrequency[range]++;
                    count++;
                }
            }

            if (count == 10) {
                for (int i = 0; i < valueFrequency.length; i++) {
                    int lower = i * 10 + 1;
                    int upper = (i + 1) * 10;

                    System.out.print(lower + " - " + upper + "\t|");
                    for (int j = 0; j < valueFrequency[i]; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}

