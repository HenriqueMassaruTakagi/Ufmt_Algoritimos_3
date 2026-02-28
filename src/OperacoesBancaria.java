public class OperacoesBancaria {
    
    public double verificarSaldo(Conta conta) {
        if (conta.isLimiteExtra()) {
            return conta.getValorEmConta() + conta.getValorLimiteExtra();
        }
        return conta.getValorEmConta();
    }   
     public void depositar(Conta conta, double valor) {
        if(valor > 0){
            conta.setValorEmConta(conta.getValorEmConta() + valor);
            System.out.println("Deposito Realizado");
        }else{
            System.out.println("Valor Invalido");
        }
     }
     public void sacar(Conta conta, double valor) {
        
        if(valor > 0 && valor <= verificarSaldo(conta)){
            conta.setValorEmConta(conta.getValorEmConta() - valor);
            System.out.println("Saque Realizado");
        }else{
            System.out.println("Saldo Insuficiente");
        }
     }
    
}