package listas;

public class ListaEncadeada<T> {

    No<T> refEntrada;

    public ListaEncadeada() {
        this.refEntrada = null;
    }

    public int size() {
        int sizeList = 0;

        No<T> refAux = refEntrada;

        while (true) {
            if (refAux != null) {
                sizeList++;
                if (refAux.getProx() != null) {
                    refAux = refAux.getProx();
                } else {
                    break;
                }
            } else {
                break;
            }

        }

        return sizeList;
    }

    public boolean isEmpty() {
        return refEntrada == null;
    }

    public void add(T conteudo) {

        No<T> novoNo = new No<>(conteudo);
        //System.out.println("Novo NO : " + novoNo.toStringEncadeado());

        if (this.isEmpty()) {
            //System.out.println("Lista Vazia inserindo no na entrada");
            refEntrada = novoNo;
            return;
        }

        No<T> noAux = refEntrada;
        //System.out.println("RefEntrada : " + noAux.toStringEncadeado());
        //System.out.println("Tamanho : " + this.size());
        for (int i = 0; i < this.size() -1; i++) {
            //System.out.println("Percorrendo Index:" + i);
            noAux = noAux.getProx();
            //System.out.println(noAux);
        }
        noAux.setProx(novoNo);
    }

    private No<T> getNo(int index) {

        validaIndex(index);

        No<T> noAux = refEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAux;
            noAux = noAux.getProx();
        }

        return noRetorno;

    }

    private void validaIndex(int index){
        if (index > this.size()-1) {
            throw new IndexOutOfBoundsException("Não existe conteudo no indice " + index + ".");
        }
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }


}
