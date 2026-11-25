import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int anoInformado = sc.nextInt();

        boolean bissexto = verificarBissexto(anoInformado);

        if (bissexto) {
            System.out.println("O ano " + anoInformado + " e bissexto.");
        } else {
            System.out.println("O ano " + anoInformado + " nao e bissexto.");
        }

        sc.close();
    }

    public static boolean verificarBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
