
import java.util.Scanner;

public class App {

    // O sistema deve receber dois parametros, 2 numeros inteiros
    //
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        int firstParameter = terminal.nextInt();
        int secondParameter = terminal.nextInt();

        try {
            count(firstParameter, secondParameter);
        } catch (NotvalidParameterException exception) {
            System.out.println(exception);
        }

        terminal.close();
    }

    static void count(int n1, int n2) throws NotvalidParameterException{

        if(n1>n2){
            throw new NotvalidParameterException("The second number must be greater than the first number");
        }

        int count = n2 - n1;
        for(int i = 0; count > i; i++){
            System.out.println("Printing number " + (i + 1));
        }
    }



}
