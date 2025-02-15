package Atividade_veiculo;

import java.util.Scanner;

public class Main_Veiculo {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a placa do seu veiculo");
        String placa = ler.next();
        System.out.println("Digite a cor do seu veiculo");
        String cor = ler.next();
        System.out.println("Digite o Numero de passageiros que seu veiculo comporta");
        String numeroDePassageiros = ler.next();
        System.out.println("Digite a capacidade do tanque");
        String capacidadeDoTanque = ler.next();
        System.out.println("Digite a velocidade Maxima");
        double velocidaeMaxima = ler.nextDouble();
        System.out.println("Digite o consulmo medio do veiculo");
        double consumoMaedio = ler.nextDouble();

        veiculo veiculo1 = new veiculo(placa, cor, numeroDePassageiros, capacidadeDoTanque, velocidaeMaxima, consumoMaedio);

        System.out.println("\nNumero da placa:" +veiculo1.getPlaca());
        System.out.println("\nCor do veiculo:" +veiculo1.getCor());
        System.out.println("\nNumero de passageiros que seu veiculo comporta:" +veiculo1.getNumeroDePassageiros());
        System.out.println("\ncapacidade do tanque:" +veiculo1.getCapacidadeDoTanque());
        System.out.println("\nvelocidade Maxima:" +veiculo1.getVelocidaeMaxima());
        System.out.println("\nconsulmo medio do veiculo:" +veiculo1.getConsumoMaedio());



        System.out.println("Digite o Nome do livro");
        String livro = ler.next();
        System.out.println("Digite o nome do autor");
        String autor = ler.next();
        System.out.println("Digite o ISBN do livro");
        int isbn = ler.nextInt();
        System.out.println("Numeros de Paginas");
        String numroDePaginas = ler.next();
        System.out.println("Valor do livro");
        String valorDeCompra = ler.next();

        Livro livro1 = new Livro(valorDeCompra, autor, isbn, numroDePaginas, isbn);             
      
        System.out.println("\nNome do livro:" +livro1.getAutor());
        System.out.println("\nTitulo do livro:" +livro1.getTitulo());
        System.out.println("\nISBN:" +livro1.getIsbn());
        System.out.println("\nNumeros de Paginas:" +livro1.getNumeroDePaginas());
        System.out.println("\nValor de Mercado:" +livro1.getValorDeCompra());
        
        ler.close();


    }

}
