
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        System.out.print("Digite o número da agência: ");
        String agencia = scanner.next();
        System.out.print("Digite o nome do titular: ");
        String titular = scanner.next();
        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        mostrarInformacoes(numero, agencia, titular, saldo);

    }

    public static void mostrarInformacoes(int numero, String agencia, String titular, double saldo) {
        System.out.println("\nOlá " + titular + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }

}
