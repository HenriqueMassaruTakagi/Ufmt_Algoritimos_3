public class Circuloo {
    private double raio;
    private double area;
    private double perimetro;
    private double diametro;


    public Circuloo(double raio) {
        this.raio = raio;
    }


    public double getRaio() {
        return raio;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void calcularArea() {
        area = Math.PI * Math.pow(raio, 2);
    }

    public void calcularPerimetro() {
        perimetro = 2 * Math.PI * raio;
    }

    public void calcularDiametro() {
        diametro = 2 * raio;
    }
}
