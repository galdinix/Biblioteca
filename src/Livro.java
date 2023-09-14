public class Livro {

    private String nome, autor, isbn, anoDePublicacao, editora, prateleira, secao, cdd;
    private int edicao;


    public Livro() {

    }

    public Livro(String nome, String autor, String isbn, String anoDePublicacao, String editora, String prateleira, String secao, String cdd, int edicao) {
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
        this.anoDePublicacao = anoDePublicacao;
        this.editora = editora;
        this.prateleira = prateleira;
        this.secao = secao;
        this.cdd = cdd;
        this.edicao = edicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(String anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getCdd() {
        return cdd;
    }

    public void setCdd(String cdd) {
        this.cdd = cdd;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

}
