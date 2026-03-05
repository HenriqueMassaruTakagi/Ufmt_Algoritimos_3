public class Triangulo {

  private double l1, l2, l3, area;

  Triangulo(double l1, double l2,double l3){
    this.l1 = l1;
    this.l2 = l2;
    this.l3 = l3;
  }
  public double getLado1() {

    return l1;

  }
  public void setLado1(double l1) {

    this.l1 = l1;

  }
  public double getLado2() {

    return l2;

  }
  public void setLado2(double l2) {

    this.l2 = l2;

  }
  public double getLado3() {

    return l3;

  }
  public void setLado3(double l3) {

    this.l3 = l3;

  }
  public double getArea() {

    return area;

  }
  public void setArea(double area) {

    this.area = area;

  }
  public double calcularArea() {
    double s = (l1 + l2 + l3)/2;
    area = Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));//pesquisei como usar raiz pois não sabia
    return area;

  }
}
