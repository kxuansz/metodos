import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o titulo do sistema: ");
        String tituloSistema = sc.nextLine();

        exibirCabecalho(tituloSistema);

        sc.close();
    }

    public static void exibirCabecalho(String tituloInformado) {
        System.out.println("========================================");
        System.out.println("       " + tituloInformado.toUpperCase());
        System.out.println("========================================");
    }
}
