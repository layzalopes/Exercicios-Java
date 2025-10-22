import java.util.Scanner;

public class ConversorTemperatura {

    // Método que converte Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    // Bloco main para entrada do usuário
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsiusParaFahrenheit(celsius);
        System.out.println(celsius + "°C equivalem a " + fahrenheit + "°F");

        scanner.close();
    }
}
