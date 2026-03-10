public class SuperCogumelo extends Cogumelo {

    public SuperCogumelo(int quantidade) {
        super("Super Cogumelo","Grande","Vermelho com pontos brancos",quantidade);
    }
    @Override
    public void usarCogumelo(Agente agente) {
        agente.setAltura(agente.getAltura() * 2);
        System.out.println("Altura aumentou 100%");
    }
}
