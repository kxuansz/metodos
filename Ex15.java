import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a posicao N do termo de Fibonacci: ");
        int posicaoTermo = sc.nextInt();

        int valorTermo = obterFibonacci(posicaoTermo);

        System.out.println("O termo na posicao " + posicaoTermo + " e: " + valorTermo);

        sc.close();
    }

    public static int obterFibonacci(int posicao) {
        if (posicao <= 1) {
            return posicao;
        }
        return obterFibonacci(posicao - 1) + obterFibonacci(posicao - 2);
    }
}
