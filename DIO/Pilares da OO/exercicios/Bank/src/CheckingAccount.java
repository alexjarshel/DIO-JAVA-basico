public class CheckingAccount extends Account {

    @Override
    public void printExtract() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println(String.format("Checking Account branch : %d ", super.bankBranch));
        System.out.println(String.format("Checking Account Number : %d" , super.accountNumber));
        System.out.println(String.format("Checking Account balance : %.2f " , super.balance));
    }


}
