import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o IMC: ");
        double imcCalculado = sc.nextDouble();

        String classificacao = classificarImc(imcCalculado);

        System.out.println("Classificacao: " + classificacao);

        sc.close();
    }

    public static String classificarImc(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25.0) {
            return "Peso normal";
        } else if (imc < 30.0) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}
