package Filas;

class No<T> {

    private T obj;
    private No<T> prox = null;

    public No (T obj){
        this.obj = obj;
    }

    public Object getDado() {
        return obj;
    }   
    public void setDado(T obj) {
        this.obj = obj;
    }

    public No getProx() {
        return prox;
    }
    public void setProx(No prox) {
        this.prox = prox;
    }

    @Override

    public String toString(){
        return "{dado : " + this.obj +"}";
    }
     
}