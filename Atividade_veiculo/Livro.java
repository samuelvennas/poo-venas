package Atividade_veiculo;

public class Livro {

    private String titulo;
    private String autor;
    private int isbn;
    private String numeroDePaginas;
    private double valorDeCompra;

    



    public Livro(String titulo, String autor, int isbn, String numeroDePaginas, double valorDeCompra) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroDePaginas = numeroDePaginas;
        this.valorDeCompra = valorDeCompra;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public String getNumeroDePaginas() {
        return numeroDePaginas;
    }
    public void setNumeroDePaginas(String numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
    public double getValorDeCompra() {
        return valorDeCompra;
    }
    public void setValorDeCompra(double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }


    
    

    
}
