package listasDuplamenteEncadeadas;

import listas.No;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.tamanhoLista = 0;
        this.ultimoNo = null;
        this.primeiroNo = null;
    }

    public int size() {
        return tamanhoLista;
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = primeiroNo;

        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getProximo();
        }

        return noAuxiliar;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    public void add(T conteudo) {

        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        novoNo.setProximo(null);
        novoNo.setPrevio(ultimoNo);

        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if (ultimoNo != null) {
            ultimoNo.setProximo(novoNo);
        }

        ultimoNo = novoNo;
        tamanhoLista++;

    }

    public void add(int index, T conteudo) {
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<T>(conteudo);
        novoNo.setProximo(noAuxiliar);

        if (novoNo.getProximo() != null) {
            novoNo.setPrevio(noAuxiliar.getPrevio());
            novoNo.getProximo().setPrevio(novoNo);
        } else {
            novoNo.setPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getPrevio().setProximo(novoNo);
        }

        tamanhoLista++;
    }

    public void remove(int index) {

        if (index == 0) {
            primeiroNo = primeiroNo.getProximo();
            if (primeiroNo != null) {
                primeiroNo.setPrevio(null);
            }
        } else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getPrevio().setProximo(noAuxiliar.getProximo());
            if (noAuxiliar != ultimoNo) {
                noAuxiliar.getProximo().setPrevio(noAuxiliar.getPrevio());
            } else {
                ultimoNo = noAuxiliar.getPrevio();
            }
        }

        this.tamanhoLista--;

    }

    @Override
    public String toString() {
        String stringRetorno = "-------\n";
        stringRetorno += "Lista Duplamente Encadeada  \n";
        stringRetorno += "-------\n";

        NoDuplo<T> noauxiliar = primeiroNo;

        for (int i = 0; i < this.tamanhoLista; i++) {
            stringRetorno += "No{conteudo : " + noauxiliar.getConteudo() + "} --> ";
            noauxiliar = noauxiliar.getProximo();
        }


        stringRetorno += "Null\n";


        return stringRetorno;
    }
}
