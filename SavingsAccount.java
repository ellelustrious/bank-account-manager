
/**
 * A subclass of BankAccount
 * 
 * @author Michelle Pham
 * @version Nov 28, 2016 / Final
 */
public class SavingsAccount extends BankAccount 
{
    private final static double ANNUAL_INTEREST = 0.009;

    public SavingsAccount(double initialBalance, String id) 
    {
        super(initialBalance, id);
    }

    @Override
    public void endOfMonth() 
    {
        super.deposit(getBalance() * (ANNUAL_INTEREST / 12));
    }
}

