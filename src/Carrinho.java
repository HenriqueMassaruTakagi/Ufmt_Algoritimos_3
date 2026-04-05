import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho {

    private ArrayList<Item> itens = new ArrayList<>();

    public void adicionar(Item item) {
        itens.add(item);
        System.out.println("Item adicionado!");
    }

    public void consultar() {
        System.out.println("\n===== CARRINHO =====");

        if (itens.isEmpty()) {
            System.out.println("Carrinho vazio!");
            return;
        }

        for (int i = 0; i < itens.size(); i++) {
            Item item = itens.get(i);
            System.out.println(i + " - " + item.getNome() + " | Quantidade: " + item.getQuantidade());
        }
    }

    public void editar(Scanner scanner) {
        consultar();

        if (itens.isEmpty()) return;

        System.out.print("Índice do item: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= itens.size()) {
            System.out.println("Índice inválido!");
            return;
        }

        System.out.print("Nova quantidade: ");
        int qtd = scanner.nextInt();
        scanner.nextLine();

        itens.get(index).setQuantidade(qtd);
        System.out.println("Item atualizado!");
    }

    public void excluir(Scanner scanner) {
        consultar();

        if (itens.isEmpty()) return;

        System.out.print("Índice do item: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= itens.size()) {
            System.out.println("Índice inválido!");
            return;
        }

        itens.remove(index);
        System.out.println("Item removido!");
    }
}