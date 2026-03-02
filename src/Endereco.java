public class Endereco {
    private String bairro;
    private String rua;
    private String cidade;
    private int numero;
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public int getNumero(int numero_casa) {
        return numero;
    }
    public void setNumero(int numero_casa) {
        this.numero = numero_casa;
    }
    public String ImprimirEndereco(){
        return rua +" "+ numero+","+bairro+"," + cidade ;
    }


}
