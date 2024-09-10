public interface IAccount {


    void deposit(double value);

    void draw(double value);

    void transfer(double value, Account account);

    void printExtract();
}
