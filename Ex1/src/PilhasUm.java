import java.util.ArrayList;
import java.util.Scanner;

public class PilhasUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> p1 = lerPilha(scanner, "P1");
        ArrayList<Integer> p2 = lerPilha(scanner, "P2");

        if (verificaIgualdade(p1, p2)) {
            System.out.println("As pilhas são iguais.");
        } else {
            if (p1.size() > p2.size()) {
                System.out.println("A pilha P1 é maior.");
            } else if (p2.size() > p1.size()) {
                System.out.println("A pilha P2 é maior.");
            } else {
                System.out.println("As pilhas têm o mesmo tamanho.");
            }
        }

        imprimirMaiorMenorMedia(p1, "P1");
        imprimirMaiorMenorMedia(p2, "P2");

        int paresP1 = contarPares(p1);
        int paresP2 = contarPares(p2);

        System.out.println("Número de elementos pares na P1: " + paresP1);
        System.out.println("Número de elementos pares na P2: " + paresP2);

        scanner.close();
    }

    public static ArrayList<Integer> lerPilha(Scanner scanner, String nomePilha) {
        ArrayList<Integer> pilha = new ArrayList<>();
        System.out.print("Digite o número de elementos na pilha " + nomePilha + ": ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            int elemento = scanner.nextInt();
            pilha.add(elemento);
        }
        return pilha;
    }

    public static boolean verificaIgualdade(ArrayList<Integer> p1, ArrayList<Integer> p2) {
        return p1.equals(p2);
    }

    public static void imprimirMaiorMenorMedia(ArrayList<Integer> pilha, String nomePilha) {
        if (pilha.isEmpty()) {
            System.out.println("A pilha " + nomePilha + " está vazia.");
            return;
        }

        int maior = pilha.get(0);
        int menor = pilha.get(0);
        int soma = 0;

        for (int elemento : pilha) {
            if (elemento > maior) {
                maior = elemento;
            }
            if (elemento < menor) {
                menor = elemento;
            }
            soma += elemento;
        }

        double media = (double) soma / pilha.size();

        System.out.println("Maior elemento da " + nomePilha + ": " + maior);
        System.out.println("Menor elemento da " + nomePilha + ": " + menor);
        System.out.println("Média da " + nomePilha + ": " + media);
    }

    public static int contarPares(ArrayList<Integer> pilha) {
        int count = 0;
        for (int elemento : pilha) {
            if (elemento % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
