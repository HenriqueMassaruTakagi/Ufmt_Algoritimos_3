public class Carro {

  String modelo, cor;
  int ano, velocidade = 0;
  boolean ligado = false;

  public void ligar(){
    if(ligado){
        System.out.println("O carro "+ modelo + " ja esta ligado.");
    }else{
        ligado = true;
        System.out.println("O carro "+ modelo + " foi ligado");
    }
  }
  public void acelerar(int acelerar){
    if (ligado = false){
        System.out.println("Nao da para acelerar um carro desligado");
        return ; //Sai sem retornar nada
    }
    velocidade += acelerar;
    System.out.println("O carro "+ modelo + " acelerou. Velocidade atual "+ velocidade+ "km/h");
  }
  public void desacelerar(int acelerar){
    if (ligado = false){
        System.out.println("Nao da para desacelerar um carro desligado");
        return ; 
    }
    velocidade -= acelerar;
    System.out.println("O carro "+ modelo + " desacelerou. Velocidade atual "+ velocidade+ "km/h");
  }
  public String informacoes(){
    return " Modelo : " + modelo + "\n Cor : " + cor + "\n Ano : " + ano + "\n Velocidade : " + velocidade + "km/h";
  }
}
