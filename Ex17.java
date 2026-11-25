import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int baseInformada = sc.nextInt();

        System.out.print("Digite o expoente: ");
        int expoenteInformado = sc.nextInt();

        long resultadoPotencia = calcularPotenciaRecursiva(baseInformada, expoenteInformado);

        System.out.println(baseInformada + " elevado a " + expoenteInformado + " = " + resultadoPotencia);

        sc.close();
    }

    public static long calcularPotenciaRecursiva(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base * calcularPotenciaRecursiva(base, expoente - 1);
    }
}
