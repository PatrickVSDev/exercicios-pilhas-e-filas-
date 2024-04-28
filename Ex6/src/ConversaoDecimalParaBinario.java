import java.util.Stack;

public class ConversaoDecimalParaBinario {
    public static void main(String[] args) {
        int numeroDecimal = 42;
        Stack<Integer> pilha = new Stack<>();

        if (numeroDecimal == 0) {
            pilha.push(0);
        } else {
            while (numeroDecimal > 0) {
                int resto = numeroDecimal % 2;
                pilha.push(resto);
                numeroDecimal = numeroDecimal / 2;
            }
        }

        System.out.print("Número binário equivalente: ");
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
    }
}
