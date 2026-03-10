public class Simulador {

    private boolean ligado;

    public void ligar() {
        ligado = true;
        System.out.println("Simulador ligado");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Simulador desligado");
    }

    public void testarCogumelo(Cogumelo cogumelo, Agente agente) {

        if (ligado) {
            System.out.println("Testando " + cogumelo.getNome() + " no agente " + agente.getNome());
            cogumelo.usarCogumelo(agente);
        } else {
            System.out.println("Simulador está desligado");
        }

    }
}