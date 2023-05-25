import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice;
        float money;
        boolean result, run = false;

        Scanner sc = new Scanner(System.in);
        BankAccount ba = new BankAccount();

        System.out.println(">---------------BANK---------------<");

        // User enters ID number
        do {
            System.out.print("  ID Number    : ");
            ba.setIdNumber(0);
            ba.setIdNumber(sc.nextInt());
            sc.nextLine();

            if(ba.getIdNumber() < 1) {
                System.out.println("      Invalid ID number.");
            }
        } while (ba.getIdNumber() < 1);
        
        
        // User enters account name
        System.out.print("  Account Name : ");
        ba.setAccountName(sc.nextLine());
    
        // User enters cash balance
        do {
            System.out.print("  Cash Balance : ");
            ba.setCashBalance(0);
            ba.setCashBalance(sc.nextFloat());
            sc.nextLine();

            if(ba.getCashBalance() < 0) {
                System.out.println("      Invalid cash balance.");
            }
        } while(ba.getCashBalance() < 0);

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
                    result = ba.creditMoney(money);
                    
                    if(result == false) {
                        System.out.println("      Invalid input.");
                    }
                    
                } while(result == false);
                System.out.println("  Current Balance : " + ba.getCashBalance());
                System.out.println(">----------------------------------<");
            }
            
            // Option 2 | Debit Money
            if(choice == 2) {
                do {
                    result = false;
                    System.out.print("  Enter amount to be debited : ");
                    money = sc.nextFloat();
                    result = ba.debitMoney(money);
                    
                    if(result == false) {
                        System.out.println("      Invalid input.");
                    }
                    
                } while(result == false);
                System.out.println("  Current Balance : " + ba.getCashBalance());
                System.out.println(">----------------------------------<");
            }
            
            // Option 3 | Inquire Account
            if(choice == 3) {
                System.out.println(ba.inquireAccount());
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