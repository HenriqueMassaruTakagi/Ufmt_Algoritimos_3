import java.util.Scanner;
class Main {
    /*
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in); 
    
        Carro C1 = new Carro(); 
        System.out.println("Digite aqui as informacoes sobre o carro 1");
        System.out.println("Modelo : ");
        C1.modelo = entrada.nextLine();
        System.out.println("Cor : ");
        C1.cor = entrada.nextLine();
        System.out.println("Ano : ");
        C1.ano = entrada.nextInt();


        entrada.nextLine(); //Consome a quebra de linha deixado pelo nextInt()
        
        

        Carro C2 = new Carro(); 
        System.out.println("Digite aqui as informacoes sobre o carro 2");
        System.out.println("Modelo : ");
        C2.modelo = entrada.nextLine();
        System.out.println("Cor : ");
        C2.cor = entrada.nextLine();
        System.out.println("Ano : ");
        C2.ano = entrada.nextInt();
        
        
        
        System.out.println("Testando Metodos\n");

        C1.ligar();
        C1.acelerar(40); 
        System.out.println(C1.informacoes());

        System.out.println();

        C2.ligar();
        C2.acelerar(105); 
        System.out.println(C2.informacoes());

        entrada.close();

        
    }   
     */
    /**
    public static void main(String[] args){
        robo_aspirador robo = new robo_aspirador();

        robo.marca = "Limpa Tudo";
        robo.modelo = "AB - 3020";
        robo.bateriarestante = 50;

        robo.informacoes();
        robo.aspirar("Sala");
        robo.aspirar("Cozinha");
        robo.carregar();
        robo.aspirar("Quarto");

    }*/
    /*   
    public static void main(String[] args) {
       
        Termometro t = new Termometro();
        t.unidade = "C";
        t.temperatura_atual = 28;
        
        jardim_inteligente jardim = new jardim_inteligente();
        jardim.nomedoJardim = "Jardim Solar";
        jardim.umidade = 35;        
        jardim.termometro = t;       
        jardim.verificarRegar();
        t.temperatura_atual = 32;    
        jardim.verificarRegar();
    
    }*/
   /* 
    public static void main(String[] args) {
       
        Conta conta = new Conta("12345-6", "0001", 1000.0, true, 500.0);

     
        OperacoesBancaria operacoes = new OperacoesBancaria();


        System.out.println("Saldo: R$ " + operacoes.verificarSaldo(conta));

        operacoes.depositar(conta, 300.0);
        System.out.println("Saldo depois deposito: R$ " + operacoes.verificarSaldo(conta));

        operacoes.sacar(conta, 1500.0);
        System.out.println("Saldo depois saque: R$ " + operacoes.verificarSaldo(conta));
    }
    */    

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int continuar;

        do {
            System.out.print("Digite o raio do círculo: ");
            double raio = scanner.nextDouble();

            Circuloo circulo = new Circuloo(raio);

            circulo.calcularArea();
            circulo.calcularPerimetro();
            circulo.calcularDiametro();

            System.out.println("Área: " + circulo.getArea());
            System.out.println("Perímetro: " + circulo.getPerimetro());
            System.out.println("Diâmetro: " + circulo.getDiametro());

            System.out.print("Deseja continuar? (1 - sim | 2 - nao): ");
            continuar = scanner.nextInt();

        } while (continuar == 1);

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}


