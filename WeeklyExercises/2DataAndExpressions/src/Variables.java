import java.util.Scanner;

public class Variables {
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        Variables obj = new Variables();
        obj.go();
    }

    public void go()
    {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Inside go");
        String line;
        int age, num2=43;
        age = 13;
        float price = 12.33f;
        float agef;
        double velocity = 456.67;
        age = (int) price;
        System.out.println(age);

        System.out.println("Enter age:");
        age = myScan.nextInt();

        System.out.println("You typed "+age);
    }
}
