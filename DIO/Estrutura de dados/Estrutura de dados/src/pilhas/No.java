package pilhas;

class No {

    private int dado;
    private No prox = null;

    public No (int dado){
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }
    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getProx() {
        return prox;
    }
    public void setProx(No prox) {
        this.prox = prox;
    }

    @Override

    public String toString(){
        return "{dado : " + this.dado +"}";
    }
     
}