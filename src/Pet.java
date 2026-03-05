public class Pet {
     private String dono;
    private String nome;
    private String raca;
    private String tipo;
    private int idade;
    private boolean vacinado;

    public Pet(String dono,String nome, String raca, String tipo, int idade, boolean vacinado){
        this.dono = dono;
        this.nome = nome;
        this.raca = raca;
        this.tipo = tipo;
        this.idade = idade;
        this.vacinado = vacinado;

        System.out.println("Pet "+nome+ " cadastrado com sucesso!");
    }

    public String getDono(){
        return  dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    public String getNome(){
        return  nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getRaca(){
        return  raca;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    public String getTipo(){
        return  tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public int getIdade(){
        return  idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public boolean getVacinado(){
        return vacinado;
    }
    public void setVacinado(boolean vacinado){
        this.vacinado = vacinado;
    }

    public void ImprimirDados(){
        System.out.println("================================================");
        System.out.println("--------- Dados Cadastrados no Sistema ---------");
        System.out.println("================================================");
        System.out.println("Dono : "+ dono);
        System.out.println("Nome : "+ nome);
        System.out.println("Tipo : "+ tipo);
        System.out.println("Raca : "+ raca);
        System.out.println("Idade : "+ idade);
        if (vacinado) {
            System.out.println("Vacinado : Sim ");
        }else{
            System.out.println("Vacinado : Não ");
        }
    }
    public void FazerSom(){
        System.out.println("O animal fez algum som ai");
    }


   
}
