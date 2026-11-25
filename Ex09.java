import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String textoDigitado = sc.nextLine();

        int totalVogais = contarVogais(textoDigitado);

        System.out.println("Quantidade de vogais encontradas: " + totalVogais);

        sc.close();
    }

    public static int contarVogais(String textoOriginal) {
        int contadorVogais = 0;
        String textoMinusculo = textoOriginal.toLowerCase();

        for (int indice = 0; indice < textoMinusculo.length(); indice++) {
            char caractereAtual = textoMinusculo.charAt(indice);
            if (caractereAtual == 'a' || caractereAtual == 'e' || caractereAtual == 'i' ||
                caractereAtual == 'o' || caractereAtual == 'u') {
                contadorVogais++;
            }
        }
        return contadorVogais;
    }
}
