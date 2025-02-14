package atividade_livro;

import java.util.Scanner;

public class MainLivro {

    public static void main(String[] args) {
        
       Scanner ler = new Scanner(System.in);

       System.out.println("Digite o nome do livro: ");
       String nomeDoLivro = ler.next();
       System.out.println("Digite o nome do Autor: ");
       String autor = ler.next();
       System.out.println("Digite o numero de Paginas: ");
       int paginas = ler.nextInt();
       System.out.println("Preço: ");
       Double preco = ler.nextDouble();

       Livro livro1 = new Livro(nomeDoLivro, autor, paginas, preco);


       System.out.println("\nNome do livro: "+ livro1.getTitulo());
       System.out.println("\nNome do autor: "+ livro1.getAutor());
       System.out.println("\nNumero de paginas: "+ livro1.getNumeroDePaginas());
       System.out.println("\nPreço: "+ livro1.getPreco());
       
       ler.close();

    }


}
