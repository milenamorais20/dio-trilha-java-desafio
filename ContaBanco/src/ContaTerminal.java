import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler os dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Declarando as variáveis para armazenar os dados da conta
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitando e lendo os dados do usuário
        System.out.println("Por favor, digite o número da Conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial: ");
        saldo = scanner.nextDouble();

        // Exibindo a mensagem final com os dados fornecidos
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        // Fechando o Scanner
        scanner.close();
    }
}
