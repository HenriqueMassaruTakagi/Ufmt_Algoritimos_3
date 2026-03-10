public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public double calcularPagamento() {
        double bonus = (getSalario() * 0.10) + 3000;
        setBonus(bonus);
        return getSalario() + bonus;
    }
}