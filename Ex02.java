import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double primeiraNota = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double segundaNota = sc.nextDouble();

        double mediaPonderada = calcularMediaPonderada(primeiraNota, segundaNota);

        System.out.println("Media calculada com pesos 4 e 6: " + mediaPonderada);

        sc.close();
    }

    public static double calcularMediaPonderada(double notaUm, double notaDois) {
        return (notaUm * 4.0 + notaDois * 6.0) / 10.0;
    }
}
