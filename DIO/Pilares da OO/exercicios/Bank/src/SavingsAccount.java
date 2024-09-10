public class SavingsAccount extends Account {

    @Override
    public void printExtract() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Saving Account branch : " + super.bankBranch);
        System.out.println("Saving Account Number : " + super.accountNumber);
        System.out.println("Saving Account balance : " + super.balance);
    }



}
