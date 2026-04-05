import java.util.Scanner;

public class Cardapio {

    public static String escolherItem(Scanner scanner) {

        System.out.println("\n===== CARDÁPIO =====");
        System.out.println("1 - Cachorro-Quente");
        System.out.println("2 - Sushi");
        System.out.println("3 - Pizza");
        System.out.println("4 - Baguncinha");
        System.out.print("Escolha: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                return "Cachorro-Quente";
            case 2:
                return "Sushi";
            case 3:
                return "Pizza";
            case 4:
                return "Baguncinha";
            default:
                System.out.println("Opção inválida!");
                return null;
        }
    }
}