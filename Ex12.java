import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o capital inicial: ");
        double capitalInicial = sc.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        double taxaMensal = sc.nextDouble();

        System.out.print("Digite o tempo em meses: ");
        int tempoMeses = sc.nextInt();

        double montanteFinal = calcularJurosCompostos(capitalInicial, taxaMensal, tempoMeses);

        System.out.println("Montante final apos " + tempoMeses + " meses: R$ " + montanteFinal);

        sc.close();
    }

    public static double calcularJurosCompostos(double capital, double taxa, int meses) {
        double taxaDecimal = taxa / 100.0;
        return capital * Math.pow(1.0 + taxaDecimal, meses);
    }
}
