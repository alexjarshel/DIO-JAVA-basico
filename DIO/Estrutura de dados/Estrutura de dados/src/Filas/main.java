package Filas;

public class main {
    public static void main(String[] args) {
        
             Fila<String> fila = new Fila<>();
        fila.enqueued("Primeiro");
        fila.enqueued("Segundo");
        fila.enqueued("Terceiro");
        fila.enqueued("Quarto");
        fila.enqueued("Quinto");
        fila.enqueued("Sexto");
        fila.enqueued("Setimo");

        System.out.println(fila);

        fila.dequeued();
        System.out.println(fila.first());
        fila.dequeued();
        System.out.println(fila.first());

        fila.dequeued();
        System.out.println(fila.first());


        System.out.println(fila);
    }
}
