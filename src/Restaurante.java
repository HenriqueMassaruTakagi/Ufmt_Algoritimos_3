import java.util.Scanner;

public class Restaurante {

    static Scanner scanner = new Scanner(System.in);
    static Carrinho carrinho = new Carrinho();

    static String usuarioCorreto = "admin";
    static String senhaCorreta = "123";

    public static void main(String[] args) {

        if (!login()) {
            System.out.println("Encerrando...");
            return;
        }

        menu();
    }

    public static boolean login() {
        while (true) {
            System.out.println("\n===== LOGIN =====");
            System.out.print("Usuário (ou sair): ");
            String user = scanner.nextLine();

            if (user.equalsIgnoreCase("sair")) return false;

            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            if (user.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Login realizado!");
                return true;
            } else {
                System.out.println("Erro! Tente novamente.");
            }
        }
    }

    public static void menu() {
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cardápio");
            System.out.println("2 - Carrinho");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarItem();
                    break;
                case 2:
                    menuCarrinho();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    public static void adicionarItem() {
        String nome = Cardapio.escolherItem(scanner);

        if (nome == null) return;

        System.out.print("Quantidade: ");
        int qtd = scanner.nextInt();
        scanner.nextLine();

        carrinho.adicionar(new Item(nome, qtd));
    }

    public static void menuCarrinho() {
        int opcao;

        do {
            System.out.println("\n===== CARRINHO =====");
            System.out.println("1 - Consultar");
            System.out.println("2 - Editar");
            System.out.println("3 - Excluir");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    carrinho.consultar();
                    break;
                case 2:
                    carrinho.editar(scanner);
                    break;
                case 3:
                    carrinho.excluir(scanner);
                    break;
            }

        } while (opcao != 0);
    }
}