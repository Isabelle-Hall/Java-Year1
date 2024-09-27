import java.util.Scanner;

public class Square_Calculations {
    public static void main(String[] args)
    {
        System.out.println("Give the length of the side of a square and I will calculate the perimeter and area!");

        Scanner Scan = new Scanner(System.in);

        int side, perimeter, area;
        System.out.println("Side length: ");
        side = Scan.nextInt();

        perimeter = side * 4;
        area = side * side;

        System.out.println("The perimeter is "+perimeter+"\n" +
                "The area is " +area);

    }
}
