import java.util.Scanner;

public class BankAccounts {

    public static void main(String[] args) {

        CustomerAccount[] accounts = new CustomerAccount[30];
        Scanner scan = new Scanner(System.in);

        int options;
        do {
            System.out.println("1) Make an Account");
            System.out.println("2) Make a Deposit");
            System.out.println("3) Make a Withdrawal");
            System.out.println("4) Exit program");
            System.out.print("Enter option: ");
            options = scan.nextInt();

            switch (options) {
                case 1:
                    createAccount(accounts);
                    break;
                case 2:
                    makeDeposit(accounts);
                    break;
                case 3:
                    makeWithdrawal(accounts);
                    break;
                case 4:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        while
        (options != 4);
    }

    private static void createAccount(CustomerAccount[] accounts) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = scan.nextInt();
        System.out.print("Enter name: ");
        String name = scan.next();

        accounts[accountNumber - 1] = new CustomerAccount(name, accountNumber);
        System.out.println("Account created.");
    }

    private static void makeDeposit(CustomerAccount[] accounts) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = scan.nextInt();

        System.out.print("Enter deposit amount: ");
        double amount = scan.nextDouble();

        accounts[accountNumber - 1].deposit(amount);
        System.out.println("Updated balance: £" + accounts[accountNumber - 1].getBalance());
    }

    private static void makeWithdrawal(CustomerAccount[] accounts) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = scan.nextInt();

        System.out.print("Enter withdrawal amount: ");
        double amount = scan.nextDouble();
        if (amount <= 0 || amount > accounts[accountNumber - 1].getBalance()) {
            System.out.println("Insufficient funds.");
            return;
        }

        accounts[accountNumber - 1].withdraw(amount);
        System.out.println("Updated balance: £" + accounts[accountNumber - 1].getBalance());
    }

    public static class CustomerAccount {
        String accountNumber;
        double accountBalance;
        double rate = 0.03;

        public CustomerAccount(String accountNumber, int number) {
            this.accountNumber = accountNumber;
            this.accountBalance = 0.0;
        }

        public double deposit(double amount) {
            if (amount > 0)
                accountBalance = accountBalance + amount;

            return accountBalance;
        }

        public double withdraw(double amount) {
            if (amount > 0 && amount < accountBalance)
                accountBalance = accountBalance - amount;
            else {
                System.out.println("You have insufficient funds!");
            }

            return accountBalance;
        }

        public double addInterest() {
            accountBalance += (accountBalance * rate);
            return accountBalance;
        }

        public double getBalance() {
            return accountBalance;
        }
    }
}
