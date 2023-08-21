import javax.sound.midi.Soundbank;
import java.util.Scanner;
public  class Main {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Livro livro[] = new Livro[999];
        String retorno;
        int controle = 0;

        do {
            System.out.println("1- Cadastrar livro:");
            System.out.println("2- Proucurar livro: ");
            System.out.println("3- Listar livro: ");
            System.out.println("4- Quantidade cadastrada de livros: ");
            System.out.println("5- Excluir ultimio livro da lista");
            System.out.println("6- Ordenar livros cadastrados");
            System.out.println("7- Encerrar programa");
            retorno =inp.next();


            switch (retorno){
                case "1":
                    String nome, autor, isbn, anoDePublicacao, editora, prateleira, secao, cdd;
                    int edicao;
                    System.out.println("Informe o nome do livro");
                    nome=inp.next();
                    System.out.println("Informe o autor:");
                    autor=inp.next();
                    System.out.println("Informe isbn");
                    isbn=inp.next();
                    System.out.println("Informe o ano de publicacao: ");
                    anoDePublicacao=inp.next();
                    System.out.println("Informe a editora: ");
                    editora=inp.next();
                    System.out.println("Informe a prateleira: ");
                    prateleira=inp.next();
                    System.out.println("Informe a secao: ");
                    secao =inp.next();
                    System.out.println("Informe cdd: ");
                    cdd = inp.next();
                    System.out.println("Informe a edicao: ");
                    edicao = inp.nextInt();
                    livro[controle]= new Livro(nome, autor, isbn, anoDePublicacao, editora, prateleira, secao, cdd, edicao);
                    controle++;
                    break;

                case "4":
                    System.out.println("total = 1000");
                    System.out.println("Usado = " + controle);
                    System.out.println("Livre ="+ (1000 - controle));
            }

        } while (!retorno.equals("7"));
    }
}
