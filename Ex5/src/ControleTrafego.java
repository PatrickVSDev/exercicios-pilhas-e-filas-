import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ControleTrafego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> filaDecolagem = new LinkedList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Listar o número de aviões aguardando na fila para decolagem");
            System.out.println("2 - Autorizar a decolagem do primeiro avião da fila");
            System.out.println("3 - Adicionar um avião à fila de espera");
            System.out.println("4 - Listar todos os aviões na fila");
            System.out.println("5 - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Número de aviões aguardando na fila para decolagem: " + filaDecolagem.size());
                    break;
                case 2:
                    if (!filaDecolagem.isEmpty()) {
                        String aviaoDecolando = filaDecolagem.poll();
                        System.out.println("Autorizando a decolagem do avião: " + aviaoDecolando);
                    } else {
                        System.out.println("Não há aviões na fila para decolagem.");
                    }
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Digite o nome do avião a ser adicionado à fila de espera: ");
                    String novoAviao = scanner.nextLine();
                    filaDecolagem.offer(novoAviao);
                    System.out.println("O avião " + novoAviao + " foi adicionado à fila de espera.");
                    break;
                case 4:
                    System.out.println("Aviões na fila de espera para decolagem:");
                    for (String aviao : filaDecolagem) {
                        System.out.println(aviao);
                    }
                    break;
                case 5:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
