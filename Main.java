import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice;
        float money;
        boolean result, run = false;

        int idNumber;
        String accountName;
        float cashBalance;

        Scanner sc = new Scanner(System.in);

        System.out.println(">---------------BANK---------------<");

        // User enters ID number
        do {
            System.out.print("  ID Number    : ");
            idNumber = 0;
            idNumber = sc.nextInt();
            sc.nextLine();

            if(idNumber < 1) {
                System.out.println("      Invalid ID number.");
            }
        } while (idNumber< 1);
        
        
        // User enters account name
        System.out.print("  Account Name : ");
        accountName = sc.nextLine();
    
        // User enters cash balance
        do {
            System.out.print("  Cash Balance : ");
            cashBalance = 0;
            cashBalance = sc.nextFloat();
            sc.nextLine();

            if(cashBalance < 0) {
                System.out.println("      Invalid cash balance.");
            }
        } while(cashBalance < 0);

        BankAccount account = new BankAccount(idNumber, accountName, cashBalance);

        System.out.println(">----------------------------------<");

        while(run == false) {

            // Option to credit money, debit money, inquire account, or end program
            System.out.println("  (1) Credit Money");
            System.out.println("  (2) Debit Money");
            System.out.println("  (3) Inquire Account");
            System.out.println("  (4) Quit Program\n");
            
            do {
                System.out.print("  Enter Choice : ");
                choice = sc.nextInt();
    
                if(choice < 1 || choice > 4) {
                    System.out.println("      Invalid choice.");
                }
    
            } while(choice < 1 || choice > 4);
    
            System.out.println(">----------------------------------<");
            
            // Option 1 | Credit Money
            if(choice == 1) {
                do {
                    result = false;
                    System.out.print("  Enter amount to be credited : ");
                    money = sc.nextFloat();
                    result = account.creditMoney(money);
                    
                    if(result == false) {
                        System.out.println("      Invalid input.");
                    }
                    
                } while(result == false);
                System.out.println("  Current Balance : ₱" + account.getCashBalance());
                System.out.println(">----------------------------------<");
            }
            
            // Option 2 | Debit Money
            if(choice == 2) {
                do {
                    result = false;
                    System.out.print("  Enter amount to be debited : ");
                    money = sc.nextFloat();
                    result = account.debitMoney(money);
                    
                    if(result == false) {
                        System.out.println("      Invalid input.");
                    }
                    
                } while(result == false);
                System.out.println("  Current Balance : ₱" + account.getCashBalance());
                System.out.println(">----------------------------------<");
            }
            
            // Option 3 | Inquire Account
            if(choice == 3) {
                System.out.println(account.inquireAccount());
                System.out.println(">----------------------------------<");
            }
    
            // Option 4 | Exit Program
            if(choice == 4) {
                run = true;
            }
        } 
        sc.close();
    }
}