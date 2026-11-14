package cod;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static Fila filas = new Fila();

    public static void main(String[] args) {
        int opcao = 1;

        while (opcao != 0){
            System.out.println("----Menu----");
            System.out.println("1- Adicionar Livro");
            System.out.println("2- Remover Livro");
            System.out.println("3- Recuperar Livro");
            System.out.println("4- Listar Livros");
            System.out.println("5- Quantidade de Livros");
            System.out.println("6- Posições");
            System.out.println("0- Sair");
            System.out.println("Escolha a opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Digite apenas números!");
                scanner.nextLine();
                opcao = 9;
            }
            switch (opcao) {

                case 1:
                    System.out.println("Titulo: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.println("Paginas");
                    int paginas = scanner.nextInt();

                    Livro livro = new Livro(titulo, autor, paginas);
                    if(filas.adicionar(livro)) {
                        System.out.println("Livro adicionado com sucesso!");
                    }else {
                        System.out.println("A fila está cheia");
                    }
                    break;

                    case 2:
                        Livro removido = filas.remover();
                        if(removido != null) {
                            System.out.println("O livro removido com sucesso!" + removido);
                        }else{
                            System.out.println("A fila está cheia");
                        } break;

                case 3:
                    System.out.print("Título do livro: ");
                    Livro achado = filas.recuperar(scanner.nextLine());
                    if (achado == null) {
                        System.out.println("Não encontrado.");
                    } else {
                        System.out.println(achado);
                    }
                    break;

                case 4:
                    filas.listar();
                    break;

                case 5:
                    System.out.println("Quantidade: " + filas.quantidade());
                    break;

                case 6:
                    System.out.print("Título do livro: ");
                    int pos = filas.posicaolivro(scanner.nextLine());
                    if (pos == -1) {
                        System.out.println("Não encontrado.");
                    } else {
                        Livro frente = filas.obterlivro(pos - 1);
                        Livro depois = filas.obterlivro(pos + 1);
                        System.out.println("Posição: " + (pos + 1) + "º");
                        if(frente == null) {
                            System.out.println("À frente: ninguém");
                        }else {
                            System.out.println("A frente " + frente);
                        }
                         if(depois == null) {
                            System.out.println("Depois: ninguém");
                        }else {
                             System.out.println("Depois " + depois);
                         }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");


            }
        }
    }
}