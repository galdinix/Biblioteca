public class Revista extends Livro{
    private String ISSN;
    public Revista(String nome, String autor, String isbn, String anoDePublicacao, String editora, String prateleira, String secao, String cdd, int edicao, String ISSN) {
        super(nome, autor, isbn, anoDePublicacao, editora, prateleira, secao, cdd, edicao);
        this.ISSN = ISSN;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }
}
