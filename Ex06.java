import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        int numeroTestado = sc.nextInt();

        boolean resultadoPrimo = verificarPrimo(numeroTestado);

        if (resultadoPrimo) {
            System.out.println(numeroTestado + " e um numero primo.");
        } else {
            System.out.println(numeroTestado + " nao e um numero primo.");
        }

        sc.close();
    }

    public static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
