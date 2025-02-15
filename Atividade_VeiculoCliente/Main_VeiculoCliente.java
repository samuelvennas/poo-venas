package Atividade_VeiculoCliente;

import java.util.Scanner;

public class Main_VeiculoCliente {
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
        
        veiculo1.setPlaca(placa);
        veiculo1.setCor(cor);
        veiculo1.setNumeroDePassageiros(numeroDePassageiros);
        veiculo1.setCapacidadeDoTanque(capacidadeDoTanque);
        veiculo1.setConsumoMaedio(consumoMaedio);
        veiculo1.setVelocidaeMaxima(velocidaeMaxima);

        
        System.out.println("\nNumero da placa:" +veiculo1.getPlaca());
        System.out.println("\nCor do veiculo:" +veiculo1.getCor());
        System.out.println("\nNumero de passageiros que seu veiculo comporta:" +veiculo1.getNumeroDePassageiros());
        System.out.println("\ncapacidade do tanque:" +veiculo1.getCapacidadeDoTanque());
        System.out.println("\nvelocidade Maxima:" +veiculo1.getVelocidaeMaxima());
        System.out.println("\nconsulmo medio do veiculo:" +veiculo1.getConsumoMaedio());

    }

}
