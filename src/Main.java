import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Livro livro[] = new Livro[1000];
        Revista revistas[] = new Revista[1000];
        String retorno;
        int controleLivro = 0, controleRevista = 0;



        do {
            System.out.println("1- Cadastrar livro:");
            System.out.println("2- Cadastrar uma revista: ");
            System.out.println("3- Proucurar um livro: ");
            System.out.println("4- Proucurar uma revista");
            System.out.println("5-  Listar um livro: ");
            System.out.println("6- Listar revista: ");
            System.out.println("7- Quantidade cadastrada de livros e revistas: ");
            System.out.println("8- Excluir ultimio livro da lista");
            System.out.println("9- Excluir ultimio Revista da Lista");
            System.out.println("10- Ordenar livros cadastrados");
            System.out.println("11- Encerrar programa");
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
                    livro[controleLivro]= new Livro(nome, autor, isbn, anoDePublicacao, editora, prateleira, secao, cdd, edicao);
                    controleLivro++;
                    break;


                case "2":
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
                    break;


                case "3":
                    System.out.println(livro[0].getNome());
                    String nomeLivro;
                    System.out.println("Informe o titulo do livro ou o nome do Autor:");
                    nomeLivro = inp.next();

                    for( int j =0; j<controleLivro; j++){

                        if (livro[j].getNome().toLowerCase().indexOf(nomeLivro)!= -1 || livro[j].getAutor().toLowerCase().indexOf(nomeLivro)!= -1 ){

                            System.out.println("livro " + (j+1) + ":"
                                    + " nome: " + livro[j].getNome() + " / "
                                    + " autor: " + livro[j].getAutor() + " / "
                                    + " ISBN: " + livro[j].getIsbn() + " / "
                                    + " ano de publicação: " +  livro[j].getAnoDePublicacao() + " / "
                                    + " Editora: " + livro[j].getEditora() + " / "
                                    + " prateleira: "  + livro[j].getPrateleira() + " / "
                                    + " seção: "  + livro[j].getSecao() + " / "
                                    + " CDD: " + livro[j].getCdd() + " / "
                                    + " Edição: " + livro[j].getEdicao() + " / ");

                        }
                    }
                    break;

                case "4":
                    String nomeRevista;
                    System.out.println("Informe o titulo da revista ou o nome do Autor:");
                    nomeRevista = inp.next();

                    for( int j =0; j<controleRevista; j++){

                        if (livro[j].getNome().toLowerCase().indexOf(nomeRevista)!= -1 || livro[j].getAutor().toLowerCase().indexOf(nomeRevista)!= -1 ){

                            System.out.println("livro " + (j+1) + ":"
                                    + " nome: " + revistas[j].getNome() + " / "
                                    + " autor: " + revistas[j].getAutor() + " / "
                                    + " ISBN: " + revistas[j].getISSN() + " / "
                                    + " ano de publicação: " +  revistas[j].getAnoDePublicacao() + " / "
                                    + " Editora: " + revistas[j].getEditora() + " / "
                                    + " prateleira: "  + revistas[j].getPrateleira() + " / "
                                    + " seção: "  + revistas[j].getSecao() + " / "
                                    + " CDD: " + revistas[j].getCdd() + " / "
                                    + " Edição: " + revistas[j].getEdicao() + " / ");

                        }
                    }
                    break;



                case "5":
                    for(int i =0;  i<controleLivro; i++){
                        System.out.println("livro " + (i+1) + ":"
                                + " nome: " + livro[i].getNome() + " / "
                                + " autor: " + livro[i].getAutor() + " / "
                                + " ISBN: " + livro[i].getIsbn() + " / "
                                + " ano de publicação: " +  livro[i].getAnoDePublicacao() + " / "
                                + " Editora: " + livro[i].getEditora() + " / "
                                + " prateleira: "  + livro[i].getPrateleira() + " / "
                                + " seção: "  + livro[i].getSecao() + " / "
                                + " CDD: " + livro[i].getCdd() + " / "
                                + " Edição: " + livro[i].getEdicao() + " / ");

                    }
                    break;


                case "6":
                    for(int i =0;  i<controleRevista; i++){
                        System.out.println("Revista " + (i+1) + ":"
                                + " nome: " + revistas[i].getNome() + " / "
                                + " autor: " + revistas[i].getAutor() + " / "
                                + " ISNN: " + revistas[i].getISSN() + " / "
                                + " ano de publicação: " +  revistas[i].getAnoDePublicacao() + " / "
                                + " Editora: " + revistas[i].getEditora() + " / "
                                + " prateleira: "  + revistas[i].getPrateleira() + " / "
                                + " seção: "  + revistas[i].getSecao() + " / "
                                + " CDD: " + revistas[i].getCdd() + " / "
                                + " Edição: " + revistas[i].getEdicao() + " / ");

                    }
                    break;

                case "7":
                    System.out.println("--------LIVROS--------");

                    System.out.println("total = 1000");
                    System.out.println("Usado = " + controleLivro);
                    System.out.println("Livre ="+ (1000 - controleLivro));

                    System.out.println("--------REVISTAS--------");

                    System.out.println("total = 1000");
                    System.out.println("Usado = " + controleRevista);
                    System.out.println("Livre ="+ (1000 - controleRevista));

                    break;

                case "8":
                    if(controleLivro>0)
                        controleLivro--;
                    else{
                        System.out.println("Não existe nenhum livro cadastrado");
                    }
                    break;

                case "9" :
                    if(controleRevista>0)
                        controleRevista--;
                    else{
                        System.out.println("Não existe nenhuma Revista cadastrada");
                    }
                    break;

            }

        } while (!retorno.equals("11"));
    }
}