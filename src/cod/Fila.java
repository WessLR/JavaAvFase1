package cod;

public class Fila {
    Livro[] livros = new Livro[5];
    int inicio = 0;
    int fim = 0;
    int tamanho = 0;

public boolean adicionar(Livro livro) {
    if (tamanho == livros.length) {
        return false;
    }
    livros[fim] = livro;
    fim = (fim + 1) % livros.length;
    tamanho++;
    return true;
    }
    public Livro remover() {
        if (tamanho == 0){
            return null;
        }
        Livro remover = livros[inicio];
        livros[inicio] = null;
        inicio = (inicio + 1) % livros.length;
        tamanho--;
        return remover;
    }
    public Livro obterlivro(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            return null;
        }
        return livros[(inicio + posicao) % livros.length];
    }
    public int posicaolivro(String titulo){
        for (int i = 0; i < tamanho; i++) {
            if (obterlivro(i).getTitulo().equalsIgnoreCase(titulo)) {
                return i;
            }
        }
        return -1;
    }
    public Livro recuperar(String titulo){
        return obterlivro(posicaolivro(titulo));
    }
    public void listar(){
        if(tamanho == 0){
            System.out.println("A fila esta vazia.");
        }
        for (int i = 0; i < tamanho; i++) {
            System.out.println((i+1) + "- " + obterlivro(i));
        }
    }
    public int quantidade(){
        return tamanho;
    }
}
