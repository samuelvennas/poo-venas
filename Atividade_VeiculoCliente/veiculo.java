package Atividade_veiculo;

public class veiculo {

  private String placa;
  private String cor;
  private String numeroDePassageiros;
  private String capacidadeDoTanque;
  private double velocidaeMaxima;
  private double consumoMaedio;



  
public veiculo(String placa, String cor, String numeroDePassageiros, String capacidadeDoTanque, double velocidaeMaxima,
        double consumoMaedio) {
    this.placa = placa;
    this.cor = cor;
    this.numeroDePassageiros = numeroDePassageiros;
    this.capacidadeDoTanque = capacidadeDoTanque;
    this.velocidaeMaxima = velocidaeMaxima;
    this.consumoMaedio = consumoMaedio;
}
public String getPlaca() {
    return placa;
}
public void setPlaca(String placa) {
    this.placa = placa;
}
public String getCor() {
    return cor;
}
public void setCor(String cor) {
    this.cor = cor;
}
public String getNumeroDePassageiros() {
    return numeroDePassageiros;
}
public void setNumeroDePassageiros(String numeroDePassageiros) {
    this.numeroDePassageiros = numeroDePassageiros;
}
public String getCapacidadeDoTanque() {
    return capacidadeDoTanque;
}
public void setCapacidadeDoTanque(String capacidadeDoTanque) {
    this.capacidadeDoTanque = capacidadeDoTanque;
}
public double getVelocidaeMaxima() {
    return velocidaeMaxima;
}
public void setVelocidaeMaxima(double velocidaeMaxima) {
    this.velocidaeMaxima = velocidaeMaxima;
}
public double getConsumoMaedio() {
    return consumoMaedio;
}
public void setConsumoMaedio(double consumoMaedio) {
    this.consumoMaedio = consumoMaedio;
}

    


}
