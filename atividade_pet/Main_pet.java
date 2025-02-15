package atividade_pet;

import java.util.Scanner;


public class Main_pet {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do seu pet");
        String nome = ler.next();
        System.out.println("Digite a idade do seu pet");
        int idade = ler.nextInt();
        System.out.println("Digite a raça do seu pet");
        String raca = ler.next();
        System.out.println("Digite o porte do seu pet");
        String porte = ler.next();
        System.out.println("Digite o nome da ração que ele come");
        String alimentacao = ler.next();

        pet pet1 = new pet(nome, idade, raca, porte, alimentacao);


        System.out.println("\nNome do pet:" + pet1.getNome());
        System.out.println("\nIdade do pet:" + pet1.getIdade());
        System.out.println("\nRaça do pet:" + pet1.getRaca());
        System.out.println("\nPorte do pet:" + pet1.getPorte());
        System.out.println("\nAlimentação do pet:" + pet1.getAlimentacao());

        
        

        ler.close();
    }

}
