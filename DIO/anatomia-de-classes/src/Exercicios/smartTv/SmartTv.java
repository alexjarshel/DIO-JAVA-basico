package Exercicios.smartTv;

// Criar exemplo de uma smartTv 
// Caracteristicas ligada(bool), canal(int), volume(int),
//podera mudar o estado para ligada e desligada
// aumentar e dimnuir o volume em 1
// mudar o canal de 1 em 1

public class SmartTv {

    boolean itsOn = false;
    int chanel = 0;
    int volume = 10;

    public void changeTvState(){
        itsOn = !itsOn;
    }

    public void turnDownTheVolume(){
        volume = volume - 1;
    };

    public void turnUpTheVolume(){
        volume = volume + 1;
    }

    public void changeChanel(boolean value){
        if(value == true){
            chanel = chanel + 1;
        }else{
            chanel = chanel - 1;
        }
    }

}
