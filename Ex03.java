import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double grausCelsius = sc.nextDouble();

        double grausKelvin = converterCelsiusParaKelvin(grausCelsius);

        System.out.println("Temperatura em Kelvin: " + grausKelvin);

        sc.close();
    }

    public static double converterCelsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }
}
