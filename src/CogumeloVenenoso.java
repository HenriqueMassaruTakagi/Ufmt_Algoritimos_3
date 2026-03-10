public class CogumeloVenenoso extends Cogumelo {

    public CogumeloVenenoso(int quantidade) {
        super("Cogumelo Venenoso","Médio","Roxo com pontos amarelos",quantidade);
    }
    @Override
    public void usarCogumelo(Agente agente) {
        agente.setVitalidade(agente.getVitalidade() - 50);
        System.out.println("Vitalidade diminuiu 50%");
    }
}
