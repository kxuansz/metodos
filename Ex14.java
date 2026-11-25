import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tempo em segundos: ");
        int totalSegundos = sc.nextInt();

        formatarTempo(totalSegundos);

        sc.close();
    }

    public static void formatarTempo(int segundosEntrada) {
        int horas = segundosEntrada / 3600;
        int resto = segundosEntrada % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println("Tempo formatado: " + horas + "h " + minutos + "m " + segundos + "s");
    }
}
