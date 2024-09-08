import java.util.Scanner;

import applications.InternetBrowser;
import applications.MusicPlayback;
import applications.TelephoneCall;

public class Iphone {
    public static void main(String[] args) throws Exception {

        boolean applicationRuning = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("System start");
        while (applicationRuning) {
            System.out.println("Welcome to iphone choose the application you want according to the number");
            System.out.println("1 - telephone call");
            System.out.println("2 - Internet Browser");
            System.out.println("3 - Music playback");
            System.out.println("4 - Turn off");

            int applicationCode = sc.nextInt();

            System.out.println(applicationCode);

            if (applicationCode == 2) {
                InternetBrowser internetBrowser = new InternetBrowser();
                internetBrowser.start();
                internetBrowser.close();
            }
            if (applicationCode == 1) {
                TelephoneCall telephoneCall = new TelephoneCall();
                telephoneCall.start();
                telephoneCall.close();
            }
            if (applicationCode == 4) {
                applicationRuning = false;
            }
            if (applicationCode == 3) {
                MusicPlayback musicPlayback = new MusicPlayback();
                musicPlayback.start();
                musicPlayback.close();
            }
        }
        sc.close();

    }
}

