package ListasCirculares;

public class Main {
    public static void main(String[] args) {

        ListaCircular<String> lista = new ListaCircular<String>();

        lista.add("ALex");
        lista.add("Teste");

        System.out.println(lista.get(0));
        System.out.println(lista.size());

        

        System.out.println(lista);

    }
}
