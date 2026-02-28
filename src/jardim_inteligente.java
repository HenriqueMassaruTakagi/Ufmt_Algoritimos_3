public class jardim_inteligente {
    public String nomedoJardim;
    public int umidade;
    Termometro termometro;

    public void verificarRegar(){
        int temperatura = termometro.lerTemperatura();
        System.out.println("Umidade atual : " + umidade + "%");

        if(temperatura >=30 && temperatura < 40){
            System.out.println("Decisao: Regar o jardim " + nomedoJardim + " agora.");
            umidade = umidade + 30; 
            if (umidade > 100) {
                umidade = 100; 
            }
            System.out.println("Irrigacao feita com sucesso. Umidade atual : " + umidade + "%");

        }else{
            System.out.println("Decisao: Nao precisa regar agora.");            
        }

    }

}
