import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Livro livro[] = new Livro[999];
        String retorno;

        do {
            System.out.println("1- Cadastrar livro:");
            System.out.println("2- Proucurar livro: ");
            System.out.println("3- Listar livro: ");
            System.out.println("4- Quantidade cadastrada de livros: ");
            System.out.println("5- Encerrar programa");
            retorno =inp.next();
        } while (!retorno.equals("5"));
    }
}