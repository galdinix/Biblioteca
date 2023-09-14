import java.util.ListResourceBundle;
import java.util.Scanner;

public class Main implements  Ilivro{

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Livro livro[] = new Livro[1000];
        Revista revistas[] = new Revista[1000];
        int controleLivro = 0, controleRevista = 0;
        String retorno = " ";
        do {
            retorno = Menu();


            switch (retorno) {
                case "1":
                    cadastrarLivro(livro);
                    controleLivro++;
                    break;


                case "2":
                    cadastrarRevista(revistas);
                    controleRevista++;
                    break;


                case "3":
                   buscarLivro(livro, controleLivro);
                    break;

                case "4":
                   buscarRevista(revistas, controleRevista);
                    break;

                case "5":
                    listarlivros(livro, controleLivro);
                    break;

                case "6":
                    listarRevista(revistas, controleRevista);
                    break;

                case "7":
                    quantidadeLivroRevista(controleLivro, controleRevista);
                    break;

                case "8":
                    excluirLivro(controleLivro, livro);
                    break;

                case "9":
                   excluirRevista(controleRevista);
                    break;

                case "10":
                    for (int y = 0; y < (controleLivro - 1); y++) {

                        for (int z = 0; z < (controleLivro - 1); z++) {
                            Livro aux = new Livro();
                            Livro aux1 = new Livro();
                            aux = livro[z];
                            aux1 = livro[z + 1];
                            if (aux.getNome().toLowerCase().compareTo(aux1.getNome().toLowerCase()) > 0) {
                                livro[controleLivro] = aux1;
                                livro[controleLivro] = aux;
                            }
                        }
                    }
                    break;

                case "11":
                    for (int x = 0; x < (controleRevista - 1); x++) {

                        for (int z = 0; z < (controleRevista - 1); z++) {
                            Revista aux = new Revista();
                            Revista aux1 = new Revista();
                            aux = revistas[z];
                            aux1 = revistas[z + 1];
                            if (aux.getNome().toLowerCase().compareTo(aux1.getNome().toLowerCase()) > 0) {
                                revistas[controleRevista] = aux1;
                                revistas[controleRevista] = aux;
                            }
                        }
                    }
                    break;

            }

        } while (!retorno.equals("12"));
    }

    public static String Menu(){
        String retorno = " ";
        Scanner inp = new Scanner(System.in);

            System.out.println("1- Cadastrar livro:");
            System.out.println("2- Cadastrar uma revista: ");
            System.out.println("3- Proucurar um livro: ");
            System.out.println("4- Proucurar uma revista");
            System.out.println("5-  Listar um livro: ");
            System.out.println("6- Listar revista: ");
            System.out.println("7- Quantidade cadastrada de livros e revistas: ");
            System.out.println("8- Excluir um livro da lista");
            System.out.println("9- Excluir uma Revista da Lista");
            System.out.println("10- Ordenar livros cadastrados");
            System.out.println("11- Ordenar revistas cadastradas");
            System.out.println("12- Encerrar programa");
            return retorno = inp.next();

    }

    public static void cadastrarLivro(Livro[] livro){
        Scanner inp = new Scanner(System.in);
        String nome, autor, isbn, anoDePublicacao, editora, prateleira, secao, cdd;
        int edicao;
        int controleLivro = 0, controleRevista = 0;

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
            livro[controleLivro]= new Livro(nome, autor, isbn, anoDePublicacao, editora, prateleira, secao, cdd, edicao);




        }

    public static void cadastrarRevista(Revista[] revistas){
        Scanner inp = new Scanner(System.in);
        String nome, autor, isbn, anoDePublicacao, editora, prateleira, secao, cdd;
        int edicao;
        int controleRevista = 0;

        String ISSN;
        System.out.println("Informe o nome da revista");
        nome=inp.next();
        System.out.println("Informe o autor:");
        autor=inp.next();
        System.out.println("Informe ISSN");
        ISSN=inp.next();
        isbn = " ";
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
        revistas[controleRevista]= new Revista(nome, autor, isbn, anoDePublicacao, editora, prateleira, secao, cdd, edicao, ISSN);
        controleRevista++;

    }

    public static void buscarLivro(Livro livro[], int controleLivro){
        System.out.println(livro[0].getNome());
        Scanner inp = new Scanner(System.in);
        String nomeLivro;
        System.out.println("Informe o titulo do livro ou o nome do Autor:");
        nomeLivro = inp.next();

        for (int j = 0; j < controleLivro; j++) {

            if (livro[j].getNome().toLowerCase().indexOf(nomeLivro) != -1 || livro[j].getAutor().toLowerCase().indexOf(nomeLivro) != -1) {

                System.out.println("livro " + (j + 1) + ":"
                        + " nome: " + livro[j].getNome() + " / "
                        + " autor: " + livro[j].getAutor() + " / "
                        + " ISBN: " + livro[j].getIsbn() + " / "
                        + " ano de publicação: " + livro[j].getAnoDePublicacao() + " / "
                        + " Editora: " + livro[j].getEditora() + " / "
                        + " prateleira: " + livro[j].getPrateleira() + " / "
                        + " seção: " + livro[j].getSecao() + " / "
                        + " CDD: " + livro[j].getCdd() + " / "
                        + " Edição: " + livro[j].getEdicao() + " / ");

            }
        }
    }

    public static void buscarRevista(Revista revistas[], int controleRevista){
        String nomeRevista;
        Scanner inp = new Scanner(System.in);
        System.out.println("Informe o titulo da revista ou o nome do Autor:");
        nomeRevista = inp.next();

        for (int j = 0; j < controleRevista; j++) {

            if (revistas[j].getNome().toLowerCase().indexOf(nomeRevista) != -1 || revistas[j].getAutor().toLowerCase().indexOf(nomeRevista) != -1) {

                System.out.println("livro " + (j + 1) + ":"
                        + " nome: " + revistas[j].getNome() + " / "
                        + " autor: " + revistas[j].getAutor() + " / "
                        + " ISBN: " + revistas[j].getISSN() + " / "
                        + " ano de publicação: " + revistas[j].getAnoDePublicacao() + " / "
                        + " Editora: " + revistas[j].getEditora() + " / "
                        + " prateleira: " + revistas[j].getPrateleira() + " / "
                        + " seção: " + revistas[j].getSecao() + " / "
                        + " CDD: " + revistas[j].getCdd() + " / "
                        + " Edição: " + revistas[j].getEdicao() + " / ");

            }
        }


    }

    public static void listarlivros(Livro[] livro, int controleLivro){

        for (int i = 0; i < controleLivro; i++) {
            System.out.println("livro " + (i + 1) + ":"
                    + " nome: " + livro[i].getNome() + " / "
                    + " autor: " + livro[i].getAutor() + " / "
                    + " ISBN: " + livro[i].getIsbn() + " / "
                    + " ano de publicação: " + livro[i].getAnoDePublicacao() + " / "
                    + " Editora: " + livro[i].getEditora() + " / "
                    + " prateleira: " + livro[i].getPrateleira() + " / "
                    + " seção: " + livro[i].getSecao() + " / "
                    + " CDD: " + livro[i].getCdd() + " / "
                    + " Edição: " + livro[i].getEdicao() + " / ");

        }
    }

    public  static void listarRevista(Revista[] revistas, int controleRevista){
        for (int i = 0; i < controleRevista; i++) {
            System.out.println("Revista " + (i + 1) + ":"
                    + " nome: " + revistas[i].getNome() + " / "
                    + " autor: " + revistas[i].getAutor() + " / "
                    + " ISNN: " + revistas[i].getISSN() + " / "
                    + " ano de publicação: " + revistas[i].getAnoDePublicacao() + " / "
                    + " Editora: " + revistas[i].getEditora() + " / "
                    + " prateleira: " + revistas[i].getPrateleira() + " / "
                    + " seção: " + revistas[i].getSecao() + " / "
                    + " CDD: " + revistas[i].getCdd() + " / "
                    + " Edição: " + revistas[i].getEdicao() + " / ");
        }

    }

    public static void quantidadeLivroRevista(int controleLivro, int controleRevista){
        System.out.println("--------LIVROS--------");

        System.out.println("total = 1000");
        System.out.println("Usado = " + controleLivro);
        System.out.println("Livre =" + (1000 - controleLivro));

        System.out.println("--------REVISTAS--------");

        System.out.println("total = 1000");
        System.out.println("Usado = " + controleRevista);
        System.out.println("Livre =" + (1000 - controleRevista));
    }

    public static void excluirLivro(int controleLivro, Livro[] livro){
        int k = 0;
        Scanner inp = new Scanner(System.in);

        System.out.println("1- lista \n 2- Palavra chave");
        String retorno = inp.next();

        if (controleLivro > 0 & retorno == "1") {
            System.out.println("Informe o livro que deseja excluir:");
            int resp = inp.nextInt();
            for (k = resp; k < controleLivro; resp++) {
                livro[k] = livro[k + 1];
            }
            livro[k + 1] = null;
        } else if (retorno == "2"){

        }
    }

    public static void excluirRevista(int controleRevista){
        if (controleRevista > 0)
            controleRevista--;
        else {
            System.out.println("Não existe nenhuma Revista cadastrada");
        }
    }

}