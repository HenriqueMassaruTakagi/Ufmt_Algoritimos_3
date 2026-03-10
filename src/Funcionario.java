public abstract class Funcionario {
    private String nome;
    private double salario;
    private double bonus;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.bonus = salario*0.10;
    }
    public abstract double calcularPagamento();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
