public class Analista extends Funcionario {
    public Analista(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public double calcularPagamento() {
        double bonus = getSalario() * 0.20;
        setBonus(bonus);
        return getSalario() + bonus;
    }
}