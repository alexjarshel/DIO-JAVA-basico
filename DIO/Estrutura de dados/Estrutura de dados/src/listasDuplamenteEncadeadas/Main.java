package listasDuplamenteEncadeadas;

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<String>();

        lista.add("ALex");
        lista.add("Teste");

        System.out.println(lista);

        lista.add(2,"terceiro");
        System.out.println(lista);
        System.out.println(lista.get(2));

        lista.remove(0);
        System.out.println(lista);
        System.out.println(lista.get(0));
        



    }
}
