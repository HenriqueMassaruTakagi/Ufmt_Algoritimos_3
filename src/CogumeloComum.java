public class CogumeloComum extends Cogumelo {

    public CogumeloComum(int quantidade) {
        super("Cogumelo Comum","Médio","Vermelho com pontos brancos",quantidade);
    }

    @Override
    public void usarCogumelo(Agente agente) {
        agente.setAltura(agente.getAltura() * 1.5);
        System.out.println("Altura aumentou 50%");
    }
}