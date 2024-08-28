import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int number;
        String branch;
        String clientName;
        Double balance;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name");
        clientName = sc.nextLine();

        System.out.println("Please enter your Account Number");
        number = sc.nextInt();

        System.out.println("Please enter your Account branch");
        branch = sc.nextLine();
        sc.nextLine();

        System.out.println("Please enter the ValueAlex");
        balance = sc.nextDouble();

        System.out.println("Hello " + clientName
                + ", thank you for creating an account at our bank, your branch is " + branch
                + ", account " + number + " and your balance " + balance + " is now available for withdrawal.\n");

        sc.close();
    }
}
