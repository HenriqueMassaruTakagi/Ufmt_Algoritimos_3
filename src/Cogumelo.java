public class Cogumelo {

    private String nome;
    private String tamanho;
    private String aparencia;
    private int quantidade;
    public Cogumelo(String nome, String tamanho, String aparencia, int quantidade) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.aparencia = aparencia;
        this.quantidade = quantidade;
    }
    public void usarCogumelo(Agente agente) {
        System.out.println("Cogumelo usado.");
    }
    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}