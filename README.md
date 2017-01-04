## Bank Account Manager
The owner of the account can deposit or withdraw money at any point. The account earns 0.9% interest annually compounded monthly. Interest is paid on the ending balance during end of month processing.

### Examples:
```java
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
```
## Expected Outcomes:
```
B2222 1185.00
F3333 1098.00
S4444 1200.90
```
