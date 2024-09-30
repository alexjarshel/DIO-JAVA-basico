package arvoresBinarias;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    };

    public void inserir(T conteudo) {
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
        if (atual == null) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoEsq(inserir(atual.getNoDir(), novoNo));
        }

        return atual;
    }

    public void exibirInOrderm() {
        System.out.println("\nExebindo em ordem");
        exibirInOrderm(this.raiz);
    }

    private void exibirInOrderm(BinNo<T> atual) {
        if (atual != null) {
            exibirInOrderm(atual.getNoEsq());
            System.out.println(atual.getConteudo() + ", ");
            exibirInOrderm(atual.getNoEsq());
        }
    }

    public void exibirPosOrderm() {
        System.out.println("\nExebindo pos ordem");
        exibirPosOrderm(this.raiz);
    }

    private void exibirPosOrderm(BinNo<T> atual) {
        if (atual != null) {
            exibirPosOrderm(atual.getNoEsq());
            exibirPosOrderm(atual.getNoEsq());
            System.out.println(atual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrderm() {
        System.out.println("\nExebindo pos ordem");
        exibirPreOrderm(this.raiz);
    }

    private void exibirPreOrderm(BinNo<T> atual) {
        if (atual != null) {
            System.out.println(atual.getConteudo() + ", ");
            exibirPreOrderm(atual.getNoEsq());
            exibirPreOrderm(atual.getNoEsq());
        }
    }

    public void remove(T conteudo){
        try{
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while(atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getNoEsq();
                }else{
                    atual = atual.getNoDir();

                }
            }

            if(atual == null){
                System.out.println("conteudo não encontrado boloco try");
            }

        }catch(NullPointerException erro){
            System.out.println("Counteudo não encontrado bloco Catch");
        }
    }
}
