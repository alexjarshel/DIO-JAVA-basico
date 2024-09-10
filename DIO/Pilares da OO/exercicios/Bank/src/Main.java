public class Main {

    public static void main(String[] args) {
        Account ca = new CheckingAccount();
        Account sa = new SavingsAccount();

        sa.printExtract();

        ca.deposit(12.79);
        ca.transfer(ca.balance, sa);

        sa.printExtract();

    }
}