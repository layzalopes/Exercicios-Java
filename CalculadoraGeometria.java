import java.util.Scanner;

public class CalculadoraGeometria {

    // Método que calcula a área do quadrado
    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    // Bloco main para entrada do usuário
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do lado do quadrado: ");
        double lado = scanner.nextDouble();

        System.out.println("A área do quadrado é: " + calcularAreaQuadrado(lado));

        scanner.close();
    }
}
