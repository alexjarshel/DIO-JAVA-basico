package Filas;

public class Fila <T>{

    private No<T> refEntrada;

    public Fila() {
        this.refEntrada = null;
    };

    public boolean isEmpty() {
        return refEntrada == null ? true : false;
    }

    public void enqueued(T obj) {
        No novoNo = new No(obj);
        novoNo.setProx(refEntrada);
        refEntrada = novoNo;
    }

    public T first() {
        if (!this.isEmpty()) {
            No primeiroNo = refEntrada;
            while (true) {
                if (primeiroNo.getProx() != null) {
                    primeiroNo = primeiroNo.getProx();
                } else {
                    break;
                }
            }
            return(T) primeiroNo.getDado();
        } else {
            return null;
        }
    }

    public T dequeued() {
        if (!this.isEmpty()) {
            No primeiroNo = refEntrada;
            No noAuxiliar = refEntrada;
            while (true) {
                if (primeiroNo.getProx() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getProx();
                } else {
                    noAuxiliar.setProx(null);
                    break;
                }
            }
            return (T)primeiroNo.getDado();
        } else {
            return null;
        }

    }

    @Override 
    public String toString(){

        String stringRetorno = "-------\n";
        stringRetorno += "Fila  \n";
        stringRetorno += "-------\n";

        No noauxiliar = refEntrada;

        while (true) {
            if(noauxiliar != null){
                stringRetorno += "[NO{dado : "+noauxiliar.getDado()+"}]\n";
                noauxiliar = noauxiliar.getProx();
            }else{
                break;
            }
        }
        stringRetorno += "=======\n";



        return stringRetorno;

    }

}
