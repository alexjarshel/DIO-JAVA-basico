package applications;

import java.util.Scanner;

public class TelephoneCall implements App {

    @Override
    public void start() {
        System.out.println("Start Telephone Call");
        Scanner sc = new Scanner(System.in);
        System.out.println("Disk Number:");
        int phoneNumber = sc.nextInt();
        call(phoneNumber);
        
        //sc.close();
    }

    @Override
    public void close() {
        System.out.println("Telephone Call closed");
    }

    private void call(int phoneNumber){
        System.out.println("Calling to : " + phoneNumber);
    }

}
