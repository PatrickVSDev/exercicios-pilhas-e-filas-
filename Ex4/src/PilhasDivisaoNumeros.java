import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PilhasDivisaoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> pilha = new Stack<>();
        Queue<Integer> filaPares = new LinkedList<>();
        Queue<Integer> filaImpares = new LinkedList<>();

        System.out.println("Digite números para a pilha (digite um número negativo para encerrar):");

        int numero;
        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                pilha.push(numero);
                if (numero % 2 == 0) {
                    filaPares.offer(numero);
                } else {
                    filaImpares.offer(numero);
                }
            }
        } while (numero >= 0);

        System.out.println("\nPilha de Números:");
        exibirPilha(pilha);

        System.out.println("\nFila de Números Pares:");
        exibirFila(filaPares);

        System.out.println("\nFila de Números Ímpares:");
        exibirFila(filaImpares);

        if (filaPares.isEmpty()) {
            System.out.println("\nA fila de números pares está vazia.");
        }

        if (filaImpares.isEmpty()) {
            System.out.println("A fila de números ímpares está vazia.");
        }

        scanner.close();
    }

    public static void exibirPilha(Stack<Integer> pilha) {
        for (Integer numero : pilha) {
            System.out.print(numero + " ");
        }
    }

    public static void exibirFila(Queue<Integer> fila) {
        for (Integer numero : fila) {
            System.out.print(numero + " ");
        }
    }
}
