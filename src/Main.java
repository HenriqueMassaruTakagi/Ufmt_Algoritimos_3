//import java.util.Scanner;
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
    /*
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
*/
/*
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        VerificarSubString verifca = new VerificarSubString();
        
        int respota =1;
        do{
            System.out .print("Insira o string a:  ");
            String a = scanner.nextLine();
            System.out .print("Insira o string b:  ");
            String b = scanner.nextLine();

            if (verifca.VerificarContidaOuN(a, b)){
                System.out.println("A string A esta contida na String B e se repete " + verifca.ContadorOcorrencias(a, b)+ " vezes");
            }else{
                System.out.println("A string A não esta contida na String B");
            }
            System.out.print("________________________________________");
            System.out.print("Deseja continuar ? \n 0 - Sair");
            respota = scanner.nextInt();
        }while (respota !=0);
    }*/
/* 
    public static void main(String[] args){
        Motorista motorista = new Motorista();
        motorista.setNome("Joao");
        motorista.setMarca_carro("Hyundai HB20 2024");
        motorista.setCor_carro("Preto");
        motorista.setPlaca_carro("OZL7H33");
        Passageiro passageiro = new Passageiro();
        passageiro.setNome("Pedro");
        Endereco endereco_origem = new Endereco();
        endereco_origem.setBairro("Bairro C");
        endereco_origem.setNumero(124);
        endereco_origem.setRua("Rua Z");
        endereco_origem.setCidade("Cuiaba");
        Endereco endereco_destino = new Endereco();
        endereco_destino.setBairro("Bairro A");
        endereco_destino.setNumero(420);
        endereco_destino.setRua("Rua C");
        endereco_destino.setCidade("Varzea Grande");

        Corrida corrida = new Corrida();
        corrida.setMotorista(motorista);
        corrida.setPassageiro(passageiro);
        corrida.setEndereco_Destino(endereco_destino);
        corrida.setEndereco_Origem(endereco_origem);

        corrida.SimularCorrida();
    }*/
    public static void main(String[] args) {
        /* 
        Pet pet1 = new Pet("Pedro","AuAu","Labrador","Cachorro",4,true);
        Pet pet2 = new Pet("Mariana Souza","Mimi", "Siamês","Gato",2,false);


        pet1.ImprimirDados();

 
        pet2.ImprimirDados();*/

        Cachorro cachorro = new Cachorro("Pedro","AuAu","Labrador","Cachorro",4,true,"Dourado");
        Gato gato = new Gato("Mariana Souza","Mimi", "Siamês","Gato",2,false,"Branco");

        cachorro.FazerSom();
        gato.FazerSom();


    }























}
