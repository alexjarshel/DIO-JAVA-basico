package arvoresBinarias;

public class BinNo<T extends Comparable<T>> {
    
    private T conteudo;
    private BinNo<T> noDir;
    private BinNo<T> noEsq;


    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BinNo<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(BinNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    public BinNo<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(BinNo<T> noDir) {
        this.noDir = noDir;
    }

    public BinNo(T conteudo){
        this.conteudo = conteudo;
        noEsq = noDir = null;
    }

    public BinNo(){}

    @Override
    public String toString(){
        return "BinNo{conteudo : "+this.conteudo+"}";
    }

}
