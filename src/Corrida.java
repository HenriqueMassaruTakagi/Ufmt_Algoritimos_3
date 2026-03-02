public class Corrida {
    private Motorista motorista;
    private Passageiro passageiro;
    private Endereco endereco_origem;
    private Endereco endereco_destino;
    public Motorista getMotorista() {
        return motorista;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    public Passageiro getPassageiro() {
        return passageiro;
    }
    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }   
    public Endereco getEnderco_Origem() {
        return endereco_origem;
    }
    public void setEndereco_Origem(Endereco endereco_o) {
        this.endereco_origem = endereco_o;
    }   
    public Endereco getEndereco_Destino() {
        return endereco_destino;
    }
    public void setEndereco_Destino(Endereco endereco_d) {
        this.endereco_destino = endereco_d;
    }   
    public void SimularCorrida(){
        System.out.println("A corrida foi iniciada");
        System.out.println("O motorista "+motorista.ImprimirMotorista()+" ira levar o passageiro "+passageiro.ImprimirPassageiro()+ " de "+ endereco_origem.ImprimirEndereco() + " á "+ endereco_destino.ImprimirEndereco());
        System.out.println("A caminho  de ... " + endereco_destino.ImprimirEndereco());
        System.out.println("Corrida finalizada passageiro entregue ao destino");
    }
}
