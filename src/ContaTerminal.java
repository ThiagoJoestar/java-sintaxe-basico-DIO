import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número da agência: ");
        String agencia = sc.nextLine();

        System.out.println("Informe o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Nome do cliente: ");
        String nomeCliente = sc.next();

        System.out.println("Por favor, informe o saldo R$:  ");
        float saldo = sc.nextFloat();

        System.out.println(String.format("Olá %s, obrigado por cliar uma conta em nosso banco.", nomeCliente));
        System.out.println(String.format("Sua agência é %s, conta %d. Saldo atual R$%.2f", agencia, numeroConta, saldo));

        sc.close();
    }
}
