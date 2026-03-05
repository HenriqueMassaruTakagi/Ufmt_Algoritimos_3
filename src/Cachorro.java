public class Cachorro extends Pet {
    private String cor;

    public Cachorro(String dono,String nome, String raca, String tipo, int idade, boolean vacinado, String cor){
            super(dono, nome,  raca,  tipo,  idade,  vacinado);
            this.cor = cor;
    }

     public String getCor(){
        return  cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    @Override
    public void FazerSom(){
        System.out.println("Au");
    }
}
