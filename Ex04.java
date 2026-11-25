import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso em Kg: ");
        double pesoCorporal = sc.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double alturaMetros = sc.nextDouble();

        double indiceMassaCorporal = calcularImc(pesoCorporal, alturaMetros);

        System.out.println("IMC calculado: " + indiceMassaCorporal);

        sc.close();
    }

    public static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }
}
