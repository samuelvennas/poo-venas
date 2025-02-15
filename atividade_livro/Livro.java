package atividade_livro;

public class Livro {

    //Atributos da class

    private  String titulo;
    private String autor;
    private int NumeroDePaginas;
    private Double preco;

    

    
        //construtor

        
    public Livro(String titulo, String autor, int numeroDePaginas, Double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.NumeroDePaginas = numeroDePaginas;
        this.preco = preco;
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
    public int getNumeroDePaginas() {
        return NumeroDePaginas;
    }
    public void setNumeroDePaginas(int numeroDePaginas) {
        NumeroDePaginas = numeroDePaginas;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    
}
