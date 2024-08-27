package Exercicios.smartTv;

public class user {

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.itsOn);
        smartTv.changeTvState();

        System.out.println(smartTv.itsOn);
        System.out.println(smartTv.chanel);
        System.out.println(smartTv.volume);

        smartTv.turnDownTheVolume();

        System.out.println(smartTv.chanel);
        System.out.println(smartTv.volume);


    }
    
}
