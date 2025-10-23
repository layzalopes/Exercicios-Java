import java.util.Scanner;

public class FormatadorNome {

    // Método que monta o nome completo
    public static String montarNomeCompleto(String primeiroNome, String sobrenome) {
        return primeiroNome + " " + sobrenome;
    }

    // Bloco main para entrada do usuário
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o primeiro nome
        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = scanner.nextLine();

        // Solicita o sobrenome
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        // Monta o nome completo e exibe
        String nomeCompleto = montarNomeCompleto(primeiroNome, sobrenome);
        System.out.println("Nome completo: " + nomeCompleto);

        scanner.close();
    }
}
