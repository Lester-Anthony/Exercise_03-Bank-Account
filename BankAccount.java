/**
 * Bank account contains attributes such as id number, account name, and cash balance
 * along with methods such as crediting money, debiting money, and inquiring account
 */
public class BankAccount {
    /**
     * The bank account's ID number
     */
    private int idNumber;
    /**
     * The name of the bank account owner
     */
    private String accountName;
    /**
     * The current balance of the bank account
     */
    private float cashBalance;

    /**
     * Sets the bank account's ID number
     * 
     * @param idNumber The bank account's ID number
     */
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    /**
     * Gets the integer value of the ID number
     * 
     * @return the ID number
     */
    public int getIdNumber() {
        return idNumber;
    }

    /**
     * Sets the name for the bank account's owner
     * 
     * @param accountName The name of the bank account owner
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    /**
     * Gets the string value of the bank account's account name
     * 
     * @return the account name
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the cash balance of the bank account
     * 
     * @param cashBalance The current balance of the bank account
     */
    public void setCashBalance(float cashBalance) {
        this.cashBalance = cashBalance;
    }
    /**
     * Gets sthe float value of the bank account's cash balance
     * 
     * @return the current cash balance
     */
    public float getCashBalance() {
        return cashBalance;
    }

    /**
     * Credits money to the bank account's cash balance
     * 
     * @param money The money to be creddited to the account
     * @return true if action was successful, false if otherwise
     */
    public boolean creditMoney(int money) {
        if(money < 0)
            return false;
        else {
            cashBalance += money; 
            return true;
        }
    }

    /**
     * Debits money from the bank account's cash balance
     * 
     * @param money The money to be debited from the account
     * @return true if action was successful, false if otherwise
     */
    public boolean debitMoney(int money) {
        if(cashBalance < money)
            return false;
        else {
            cashBalance -= money;
            return true;
        }
    }

    /**
     * Inquires the accounts ID number, account name, and cash balance
     * 
     * @return ID number, account name, and cash balance as a string
     */
    public String inquireAccount() {
        return getIdNumber() + " " + getAccountName() + " : " + getCashBalance();
    }
}
