package listas;

public class No<T> {
    private T conteudo;
    private No<T> prox = null;

    public No (){
        this.prox = null;
    }

    public No (T conteudo){
        this.prox = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }   
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProx() {
        return prox;
    }
    public void setProx(No<T> prox) {
        this.prox = prox;
    }

    @Override
    public String toString(){
        return "{conteudo : " + this.conteudo +"}";
    }

    public String toStringEncadeado(){
        String  str = "No{" +
                "Conteudo : " + this.conteudo + 
                "}";
        if(prox != null){
            str += "->" + prox.toString();
        }else{
            str += "-> null";
        }
        return str;
    }
}
