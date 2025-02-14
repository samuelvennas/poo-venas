package Exemplo;
public class Main {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Marta", 30, "sam.venas@.com");


       pessoa.setNome("Marta");
       pessoa.setIdade(30);
       pessoa.setEmail("sam.venas@.com");


        System.out.println("nome: " + pessoa.getNome());
        System.out.println("nome: " + pessoa.getIdade());
        System.out.println("nome: " + pessoa.getEmail());
        
    }

}
