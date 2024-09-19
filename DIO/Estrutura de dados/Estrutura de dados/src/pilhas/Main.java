package pilhas;

public class Main {
    public static void main(String[] args) {

        Pilha pilha = new Pilha();
        pilha.push(new No(3));
        pilha.push(new No(45));
        pilha.push(new No(55));
        pilha.push(new No(23));
        pilha.push(new No(7));
        pilha.push(new No(87));
        pilha.push(new No(73));

        System.out.println(pilha);

        /* 
        System.out.println(pilha.top());
        pilha.pop();
        System.out.println(pilha.top());
        */
    }
}
