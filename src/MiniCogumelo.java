public class MiniCogumelo extends Cogumelo {

    public MiniCogumelo(int quantidade) {
        super("Mini Cogumelo","Pequeno","Azul com pontos brancos",quantidade);
    }

    @Override
    public void usarCogumelo(Agente agente) {
        agente.setAltura(agente.getAltura() * 0.5);
        System.out.println("Altura diminuiu 50%");
    }
}
