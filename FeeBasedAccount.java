/**
 * The Fee Based Account is a subclass of Bank Account
 * 
 * @author Michelle Pham
 * @version Nov 20, 2016 / Draft
 */
public class FeeBasedAccount extends BankAccount
{
    private int transactionsThisMonth;
    
    public final static int FREE_TRANSACTIONS = 3;
    public final static double TRANSACTION_FEE = 2.00;
    
    /**
     * Constructor for objects of class FeeBasedAccount
     */
    public FeeBasedAccount(double initialBalance, String id)
    {
        super(initialBalance, id);
        transactionsThisMonth = 0;
    }

    @Override
    public void deposit(double amount)
    {
       super.deposit(amount);
       transactionsThisMonth++;
    }
    
    @Override
    public void withdraw(double amount)
    {
        super.withdraw(amount);
        transactionsThisMonth++;
    }
    
    @Override
    public void endOfMonth()
    {
        if(transactionsThisMonth > FREE_TRANSACTIONS)
        {
            super.withdraw(TRANSACTION_FEE * (transactionsThisMonth - FREE_TRANSACTIONS));
        }
    }
}
