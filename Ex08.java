import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de numeros que deseja somar (3 a 5): ");
        int quantidadeElementos = sc.nextInt();

        if (quantidadeElementos == 3) {
            System.out.print("Num 1: "); int n1 = sc.nextInt();
            System.out.print("Num 2: "); int n2 = sc.nextInt();
            System.out.print("Num 3: "); int n3 = sc.nextInt();
            System.out.println("Soma total: " + somarTudo(n1, n2, n3));
        } else {
            System.out.print("Num 1: "); int n1 = sc.nextInt();
            System.out.print("Num 2: "); int n2 = sc.nextInt();
            System.out.print("Num 3: "); int n3 = sc.nextInt();
            System.out.print("Num 4: "); int n4 = sc.nextInt();
            System.out.println("Soma total: " + somarTudo(n1, n2, n3, n4));
        }

        sc.close();
    }

    public static int somarTudo(int... numerosRecebidos) {
        int totalAcumulado = 0;
        for (int valorAtual : numerosRecebidos) {
            totalAcumulado += valorAtual;
        }
        return totalAcumulado;
    }
}
