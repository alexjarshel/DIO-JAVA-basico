package listasDuplamenteEncadeadas;

public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> previo;
    private NoDuplo<T> proximo;


    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo<T> proximo) {
        this.proximo = proximo;
    }

    public NoDuplo<T> getPrevio() {
        return previo;
    }

    public void setPrevio(NoDuplo<T> previo) {
        this.previo = previo;
    }

    public NoDuplo(T conteudo){
        this.conteudo = conteudo;
    }

    @Override
    public String toString(){
        return "Noduplo {" +
                "conteudo : " + conteudo + "}"; 
    }

}
