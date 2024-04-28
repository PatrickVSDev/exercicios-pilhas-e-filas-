import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilasUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue<Integer> fila1 = lerFila(scanner, "Fila 1");
        Queue<Integer> fila2 = lerFila(scanner, "Fila 2");

        if (verificaIgualdade(fila1, fila2)) {
            System.out.println("As filas são iguais.");
        } else {
            if (fila1.size() > fila2.size()) {
                System.out.println("A Fila 1 é maior.");
            } else if (fila2.size() > fila1.size()) {
                System.out.println("A Fila 2 é maior.");
            } else {
                System.out.println("As filas têm o mesmo tamanho.");
            }
        }

        imprimirMaiorMenorMedia(fila1, "Fila 1");
        imprimirMaiorMenorMedia(fila2, "Fila 2");

        int paresFila1 = contarPares(fila1);
        int paresFila2 = contarPares(fila2);

        System.out.println("Número de elementos pares na Fila 1: " + paresFila1);
        System.out.println("Número de elementos pares na Fila 2: " + paresFila2);

        scanner.close();
    }

    public static Queue<Integer> lerFila(Scanner scanner, String nomeFila) {
        Queue<Integer> fila = new LinkedList<>();
        System.out.print("Digite o número de elementos na " + nomeFila + ": ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            int elemento = scanner.nextInt();
            fila.offer(elemento);
        }
        return fila;
    }

    public static boolean verificaIgualdade(Queue<Integer> fila1, Queue<Integer> fila2) {
        return fila1.equals(fila2);
    }

    public static void imprimirMaiorMenorMedia(Queue<Integer> fila, String nomeFila) {
        if (fila.isEmpty()) {
            System.out.println("A " + nomeFila + " está vazia.");
            return;
        }

        int maior = fila.peek();
        int menor = fila.peek();
        int soma = 0;

        for (int elemento : fila) {
            if (elemento > maior) {
                maior = elemento;
            }
            if (elemento < menor) {
                menor = elemento;
            }
            soma += elemento;
        }

        double media = (double) soma / fila.size();

        System.out.println("Maior elemento da " + nomeFila + ": " + maior);
        System.out.println("Menor elemento da " + nomeFila + ": " + menor);
        System.out.println("Média da " + nomeFila + ": " + media);
    }

    public static int contarPares(Queue<Integer> fila) {
        int count = 0;
        for (int elemento : fila) {
            if (elemento % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
