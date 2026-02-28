public class robo_aspirador {
    public String marca, modelo;
    public int bateriarestante;

    public void carregar(){
        bateriarestante = 100;
        System.out.println("A bateria foi carregada para 100%");
        System.out.println("________________________________");
    }
    public void aspirar(String comodo){
        if(bateriarestante < 15){
            System.out.println("O robo não tem bateria suficiente para aspirar ");
            System.out.println("Bateria atual : "+ bateriarestante);
            System.out.println("________________________________");
            return;
        }
        bateriarestante -= 15;
        System.out.println("Aspirando "+comodo);
        System.out.println(comodo +" aspirado com sucesso ");
        System.out.println("Bateria restante " + bateriarestante + "%");
        System.out.println("________________________________");

    }
    public void informacoes(){
        System.out.println("Informacoes do Robo ");
        System.out.println("Marca : "+marca);
        System.out.println("Modelo : "+modelo);
        System.out.println("Bateria : " + bateriarestante + "%");
        System.out.println("________________________________");
    }

}   
