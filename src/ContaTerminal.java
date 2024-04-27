import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente :");
        String Agencia = scanner.nextLine();
        System.out.println("Por favor, digite o numero da Agencia:");
        int numeroDaAgencia = scanner.nextInt();
        System.out.println("Por favor, digite o numero da Conta:");
        int conta = scanner.nextInt();
        System.out.println("Por favor, digite o valor do saque:");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + Agencia + " " + "obrigado por criar uma conta em nosso banco, sua agência é "
                + numeroDaAgencia
                + " " + "conta " + conta + " " + "e seu saldo R$" + " " + saldo + " "
                + " á está disponível para saque");

    }
}
