public class CartaoCredito extends Pagamento implements ProcessarPag {

    private String numeroCartao;

    public CartaoCredito(String titular, double saldo, String numeroCartao) {
        super(titular, saldo);
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void pagar(double valor) {

        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Pagamento de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

    }
}
