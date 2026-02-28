public class Conta {
    private String nConta;
    private String nAgencia;
    private double valorEmConta;
    private boolean LimiteExtra;
    private double valorLimiteExtra;
    
    public Conta(String numeroConta, String numeroAgencia, double valorEmConta,boolean LimiteExtra, double valorLimiteExtra){
        this.nConta = numeroConta;
        this.nAgencia = numeroAgencia;
        this.valorEmConta = valorEmConta;
        this.LimiteExtra = LimiteExtra;
        this.valorLimiteExtra = valorLimiteExtra;
    }
    public String getNumeroConta() {
        return nConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.nConta = numeroConta;
    }

    public String getNumeroAgencia() {
        return nAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.nAgencia = numeroAgencia;
    }

    public double getValorEmConta() {
        return valorEmConta;
    }

    public void setValorEmConta(double valorEmConta) {
        this.valorEmConta = valorEmConta;
    }

    public boolean isLimiteExtra() {
        return LimiteExtra;
    }

    public void setLimiteExtra(boolean possuiLimiteExtra) {
        this.LimiteExtra = possuiLimiteExtra;
    }

    public double getValorLimiteExtra() {
        return valorLimiteExtra;
    }

    public void setValorLimiteExtra(double valorLimiteExtra) {
        this.valorLimiteExtra = valorLimiteExtra;
    }
}   
