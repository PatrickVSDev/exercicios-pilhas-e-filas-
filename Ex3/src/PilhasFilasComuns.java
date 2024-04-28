import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PilhasFilasComuns {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        Queue<Integer> fila = new LinkedList<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);

        fila.offer(3);
        fila.offer(4);
        fila.offer(5);
        fila.offer(6);

        System.out.println("Números na Pilha (P):");
        exibirNumeros(pilha);

        System.out.println("\nNúmeros na Fila (F):");
        exibirNumeros(fila);

        System.out.println("\nNúmeros Comuns entre Pilha (P) e Fila (F):");
        encontrarNumerosComuns(pilha, fila);
    }

    public static void exibirNumeros(Stack<Integer> pilha) {
        for (Integer numero : pilha) {
            System.out.print(numero + " ");
        }
    }

    public static void exibirNumeros(Queue<Integer> fila) {
        for (Integer numero : fila) {
            System.out.print(numero + " ");
        }
    }

    public static void encontrarNumerosComuns(Stack<Integer> pilha, Queue<Integer> fila) {
        for (Integer numero : pilha) {
            if (fila.contains(numero)) {
                System.out.print(numero + " ");
            }
        }
    }
}
