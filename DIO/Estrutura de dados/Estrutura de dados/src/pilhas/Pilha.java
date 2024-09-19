package pilhas;

public class Pilha {
    
    private No entradaPilha;

    public Pilha(){
        this.entradaPilha = null;
    };

    public boolean isEmplty(){
        return this.entradaPilha == null ? true : false;
         
    }

    public No top(){
        return entradaPilha;
    }

    public void push(No novoNo){
        No auxiliar = entradaPilha;
        entradaPilha = novoNo;
        entradaPilha.setProx(auxiliar);
    }

    public No pop(){
        if(!this.isEmplty()){
            No noDeRetorno = entradaPilha;
            entradaPilha = entradaPilha.getProx();
            return noDeRetorno;
        }else{
            return null;
        }

    }

    @Override public String toString(){

        String stringRetorno = "-------\n";
        stringRetorno += "Pilha  \n";
        stringRetorno += "-------\n";

        No noauxiliar = entradaPilha;

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
