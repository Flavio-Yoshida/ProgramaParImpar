import java.util.Scanner;

public class ParImparInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Digite um ou mais números inteiros separados por vírgula (ou 'sair' para encerrar):");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            String[] numerosString = input.split(",");

            for (String numeroString : numerosString) {
                try {
                    int numero = Integer.parseInt(numeroString.trim());
                    if (numero % 2 == 0) {
                        System.out.println(numero + " é par.");
                    } else {
                        System.out.println(numero + " é ímpar.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida: " + numeroString);
                }
            }
        } while (true);
    }
}
