public class Motorista {
    private String nome;
    private String marca_carro;
    private String cor_carro;
    private String placa;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome_motorista) {
        this.nome = nome_motorista;
    }
    public String getMarca_carro() {
        return marca_carro;
    }
    public void setMarca_carro(String marca) {
        this.marca_carro = marca;
    }
    public String getCor_carro() {
        return cor_carro;
    }
    public void setCor_carro(String cor) {
        this.cor_carro = cor;
    }
    public String getPlaca_carro() {
        return placa;
    }
    public void setPlaca_carro(String placa) {
        this.placa = placa;
    }
    public String ImprimirMotorista(){
        return nome;
    }
}         
