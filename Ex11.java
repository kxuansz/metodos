import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavraInformada = sc.nextLine();

        boolean ehPalindromo = verificarPalindromo(palavraInformada);

        if (ehPalindromo) {
            System.out.println("A palavra \"" + palavraInformada + "\" e um palindromo!");
        } else {
            System.out.println("A palavra \"" + palavraInformada + "\" nao e um palindromo.");
        }

        sc.close();
    }

    public static boolean verificarPalindromo(String palavra) {
        String palavraTratada = palavra.replaceAll("\\s+", "").toLowerCase();
        int esquerda = 0;
        int direita = palavraTratada.length() - 1;

        while (esquerda < direita) {
            if (palavraTratada.charAt(esquerda) != palavraTratada.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }
}
