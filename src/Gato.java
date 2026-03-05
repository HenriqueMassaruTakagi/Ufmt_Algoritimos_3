public class Gato extends Pet {
    
    private String cor;

    public Gato(String dono,String nome, String raca, String tipo, int idade, boolean vacinado, String cor){
            super(dono, nome,  raca,  tipo,  idade,  vacinado);
            this.cor = cor;
    }

     public String getCor(){
        return  cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void Derrubar_Algo(){
        System.out.println("Algo caiu");
    }
    
    @Override
    public void FazerSom(){
        System.out.println("Miau");
    }
}
