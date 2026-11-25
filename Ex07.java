import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro: ");
        int primeiroNumero = sc.nextInt();

        System.out.print("Digite o segundo numero inteiro: ");
        int segundoNumero = sc.nextInt();

        int maximoDivisorComum = calcularMdc(primeiroNumero, segundoNumero);

        System.out.println("MDC(" + primeiroNumero + ", " + segundoNumero + ") = " + maximoDivisorComum);

        sc.close();
    }

    public static int calcularMdc(int numeroUm, int numeroDois) {
        while (numeroDois != 0) {
            int resto = numeroUm % numeroDois;
            numeroUm = numeroDois;
            numeroDois = resto;
        }
        return numeroUm;
    }
}
