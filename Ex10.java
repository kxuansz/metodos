import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto para ser invertido: ");
        String textoParaInverter = sc.nextLine();

        String textoInvertido = inverterTexto(textoParaInverter);

        System.out.println("Texto invertido: " + textoInvertido);

        sc.close();
    }

    public static String inverterTexto(String textoOriginal) {
        String resultadoInvertido = "";
        for (int indice = textoOriginal.length() - 1; indice >= 0; indice--) {
            resultadoInvertido += textoOriginal.charAt(indice);
        }
        return resultadoInvertido;
    }
}
