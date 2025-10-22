import java.util.Scanner;

public class VerificadorVoto {

    // Método estático que verifica se a pessoa pode votar
    public static String podeVotar(int idade) {
        if (idade > 16) {
            return "Pode votar.";
        } else {
            return "Não pode votar.";
        }
    }

    // Bloco main para testar o método com entrada do usuário
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Chama o método e exibe o resultado
        System.out.println(podeVotar(idade));

        scanner.close();
    }
}
