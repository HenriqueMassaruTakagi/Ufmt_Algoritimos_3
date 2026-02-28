
public class Termometro {
    public String unidade;
    public int temperatura_atual;

    public int lerTemperatura() {
        System.out.println("Temperatura : " + temperatura_atual + "°" + unidade);
        return temperatura_atual;
    }
}

