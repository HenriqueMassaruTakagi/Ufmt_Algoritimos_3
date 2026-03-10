public class MegaCogumelo extends Cogumelo {

    public MegaCogumelo(int quantidade) {
        super("Mega Cogumelo","Grande","Amarelo com pontos vermelhos",quantidade);
    }

    @Override
    public void usarCogumelo(Agente agente) {
        agente.setAltura(agente.getAltura() * 10);
        System.out.println("Altura aumentou 1000%");
    }
}
