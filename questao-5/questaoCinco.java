import java.util.Scanner;

class QuestaoCinco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva qualquer palavra: ");
        String palavra = scanner.nextLine();

        String invertida = inverterPalavra(palavra);

        System.out.println("Palavra invertida: " + invertida);

        scanner.close();
    }

    public static String inverterPalavra(String entrada) {
        StringBuilder invertida = new StringBuilder(); /*Não é uma função pronta de reverse, apenas oferece uma maneira melhor 
                                                        de construir uma string mutável*/
        
        for (int i = entrada.length() - 1; i >= 0; i--) {
            invertida.append(entrada.charAt(i));
        }
    
        return invertida.toString();
    }
}
