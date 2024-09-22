package listas;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> lista = new ListaEncadeada<String>();

        lista.add("ALex");
        lista.add("Teste");
        System.out.println(lista.get(2));

    }
}
