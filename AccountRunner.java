/**
 * Tester for BankAccount and its subclasses
 */
public class AccountRunner 
{
    public static void main(String[] args) 
    {

        BankAccount[] bankAccounts = new BankAccount[3];
        bankAccounts[0] = new BankAccount(1000, "B2222");
        bankAccounts[1] = new FeeBasedAccount(1000, "F3333");
        bankAccounts[2] = new SavingsAccount(1000, "S4444");

        for (int i = 0; i < bankAccounts.length; i++) 
        {
            bankAccounts[i].deposit(250);
            bankAccounts[i].deposit(50);
            bankAccounts[i].withdraw(100);
        }

        bankAccounts[1].withdraw(100);

        for (int i = 0; i < bankAccounts.length; i++) 
        {
            bankAccounts[i].endOfMonth();
            System.out.printf(bankAccounts[i].getAccountId() + " %.2f", bankAccounts[i].getBalance());
            System.out.println();
        }
    }
}
