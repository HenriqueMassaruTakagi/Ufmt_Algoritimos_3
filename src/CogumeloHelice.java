public class CogumeloHelice extends Cogumelo {

    public CogumeloHelice(int quantidade) {
        super("Cogumelo Hélice","Médio","Laranja com hélice",quantidade);
    }

    @Override
    public void usarCogumelo(Agente agente) {
        agente.setPodeVoar(true);
        System.out.println("O agente agora pode voar!");
    }
}
