public class Agente {

    private String nome;
    private double altura;
    private int vitalidade;
    private boolean podeVoar;

    public Agente(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
        this.vitalidade = 100;
        this.podeVoar = false;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    public boolean isPodeVoar() {
        return podeVoar;
    }

    public void setPodeVoar(boolean podeVoar) {
        this.podeVoar = podeVoar;
    }
}