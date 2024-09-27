import java.util.Scanner;
import java.util.Random;

public class Dice {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        int dice1, dice2, dice1_random1, dice1_random2, dice1_random3, dice2_random1, dice2_random2, dice2_random3;
        int dice1_total, dice2_total, dice1_average, dice2_average;


        System.out.println("How many sides does die 1 have?");
        dice1 = scan.nextInt();

        System.out.println("How many sides does die 2 have?");
        dice2 = scan.nextInt();

        dice1_random1 = generator.nextInt(dice1 -1) +1;
        dice1_random2 =  generator.nextInt(dice1 -1) +1;
        dice1_random3 = generator.nextInt(dice1 -1) +1;

        dice2_random1 = generator.nextInt(dice2 -1 ) +1;
        dice2_random2 = generator.nextInt(dice2 -1) +1;
        dice2_random3 = generator.nextInt(dice2 -1) +1;

        System.out.println("Die 1 first roll = " + dice1_random1);
        System.out.println("Die 2 first roll = " + dice2_random1);

        System.out.println("Die 1 second roll = " + dice1_random2);
        System.out.println("Die 2 second roll = " + dice2_random2);

        System.out.println("Die 1 third roll = " + dice1_random3);
        System.out.println("Die 2 third roll = " + dice2_random3);

        dice1_total = (dice1_random1 + dice1_random2 + dice1_random3);
        dice2_total = (dice2_random1 + dice2_random2 + dice2_random3);

        dice1_average = dice1_total / 3;
        dice2_average = dice2_total / 3;

        System.out.println("Die 1 rolled a total of "+dice1_total+" and rolled "+dice1_average+" on average.");
        System.out.println("Die 2 rolled a total of "+dice2_total+" and rolled "+dice2_average+" on average.");

    }
}
