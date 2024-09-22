package ListasCirculares;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;

    private int tamanhoLista;

    public int size() {
        return tamanhoLista;
    }

    public boolean isEmpty() {
        return tamanhoLista == 0;
    }

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    private No<T> getNo(int index) {

        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("A lista esta vazia");
        }

        if (index == 0) {
            return this.cauda;
        }

        No<T> noAuxiliar = cauda;

        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getProx();
        }

        return noAuxiliar;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    public void remove(int index) {
        if (index >= this.tamanhoLista) {
            throw new IndexOutOfBoundsException("Indice é maior que a lista");
        }

        No<T> noAuxiliar = this.cauda;

        if (index == 0) {
            this.cauda = this.cauda.getProx();
            this.cabeca.setProx(this.cauda);
        } else if (index == 1) {
            this.cauda.setProx(this.cauda.getProx().getProx());
            ;
        } else {
            for (int i = 0; (i < index - 1) && (noAuxiliar != null); i++) {
                noAuxiliar = noAuxiliar.getProx();
            }
            noAuxiliar.setProx(noAuxiliar.getProx().getProx());
        }

        this.tamanhoLista --;

    }

    public void add(T conteudo){
        No<T> novoNo =new No<T>(conteudo);

        if(tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setProx(cauda);
        }else{
            novoNo.setProx(this.cauda);
            this.cauda = novoNo;
            this.cabeca.setProx(this.cauda);

        }

        this.tamanhoLista ++;
    } 

    @Override
    public String toString(){
        String stringRetorno = "-------\n";
        stringRetorno += "Lista Circular  \n";
        stringRetorno += "-------\n";

        No<T> noauxiliar = this.cauda;

        for(int i = 0; i < this.size(); i++ ){
            stringRetorno += "[No{conteudo : "+noauxiliar.getConteudo() +"}] --> ";
            noauxiliar = noauxiliar.getProx();
        }

        stringRetorno += this.size() != 0 ?  "(retorna ao inicio)" : "[]";


        return stringRetorno;
    }

}
