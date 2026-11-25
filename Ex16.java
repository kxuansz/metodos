import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numerosDigitados = new int[6];

        for (int indice = 0; indice < numerosDigitados.length; indice++) {
            System.out.print("Digite o numero " + (indice + 1) + ": ");
            numerosDigitados[indice] = sc.nextInt();
        }

        int[] apenasPares = filtrarPares(numerosDigitados);

        System.out.println("Numeros pares encontrados:");
        for (int parAtual : apenasPares) {
            System.out.print(parAtual + " ");
        }
        System.out.println();

        sc.close();
    }

    public static int[] filtrarPares(int[] vetorOriginal) {
        int contadorPares = 0;
        for (int valor : vetorOriginal) {
            if (valor % 2 == 0) {
                contadorPares++;
            }
        }

        int[] resultadoPares = new int[contadorPares];
        int indiceResultado = 0;

        for (int valor : vetorOriginal) {
            if (valor % 2 == 0) {
                resultadoPares[indiceResultado] = valor;
                indiceResultado++;
            }
        }

        return resultadoPares;
    }
}
