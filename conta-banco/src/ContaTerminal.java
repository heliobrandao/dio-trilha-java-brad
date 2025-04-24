import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("============ CONTA BANCÁRIA ============");
        System.out.println();
        System.out.println("Por favor, digite o número da conta: (1234)");
        numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.println("Por favor, digite o número da agência: (123-8)");
        agencia = scanner.next();
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.next();
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.println();
        System.out.println("============ DADOS DA CONTA ============");
        System.out.println();
        System.out.println("Número da conta: " + numero);
        System.out.println("Número da agência: " + agencia);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println();
        System.out.println("=========================================");
        System.out.println("Obrigado por utilizar nosso sistema!");
        System.out.println("=========================================");

        scanner.close();
    }
}
