import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        try {
            System.out.println("Número da Conta: ");
            int numeroConta = scanner.nextInt();

            System.out.println("Número da Agência: ");
            String numeroAgencia = scanner.next();

            System.out.println("Digite seu nome e sobrenome:");
            scanner.nextLine(); 
            String nomeCliente = scanner.nextLine();

            System.out.println("Digite o valor para depósito: ");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de que todos os dados foram inseridos corretamente.");
        } finally {
            scanner.close();
        }
    }
}
