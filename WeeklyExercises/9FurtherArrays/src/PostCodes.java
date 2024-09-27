import java.util.Scanner;

public class PostCodes {
    public static void main(String[] args) {
        Details[] accounts = new Details[25];
        addDetails(accounts);
    }

    private static Details addDetails(Details[] accounts) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scan.next();
        System.out.print("Enter last name: ");
        String lastName = scan.next();
        System.out.print("Enter post code: ");
        String postCode = scan.next();

        accounts[0] = new Details(firstName, lastName, postCode);
        System.out.println("Account created.");

        return new Details(firstName, lastName, postCode);
    }
}

class Details {
    private String firstName;
    private String lastName;
    private String postCode;

    public Details(String firstName, String lastName, String postCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postCode = postCode;
    }
}
