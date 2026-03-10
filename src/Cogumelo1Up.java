public class Cogumelo1Up extends Cogumelo {

    public Cogumelo1Up(int quantidade) {
        super("Cogumelo 1UP","Médio","Verde com símbolo 1UP",quantidade);
    }
    @Override
    public void usarCogumelo(Agente agente) {
        agente.setVitalidade(100);
        System.out.println("Vitalidade restaurada para 100%");
    }
}