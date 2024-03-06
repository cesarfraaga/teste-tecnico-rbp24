import java.util.Scanner;

class QuestaoDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        Verificar fibonacci = new Verificar();

        if (fibonacci.pertenceOuNao(numero)) {
            System.out.println("O número " + numero + " pertente a sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence a sequência de Fibonacci.");
        }

        scanner.close();
    }
}
