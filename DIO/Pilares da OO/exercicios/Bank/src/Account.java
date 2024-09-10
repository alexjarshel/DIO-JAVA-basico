public abstract class Account  implements IAccount{

    private static final int STANDARD_AGENCY = 1;
    private static int SEQUENTIAL = 1;

    protected int bankBranch;
    protected int accountNumber;
    protected double balance;

    
    public Account(){
        this.bankBranch = STANDARD_AGENCY;
        this.accountNumber = SEQUENTIAL ++;
    }

    //getters

    public int getBankBranch() {
        return bankBranch;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    //

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public void draw(double value) {
        this.balance = this.balance - value;
    }

    @Override
    public void transfer(double value, Account account) {
        this.draw(value);
        account.deposit(value);
    }
}
