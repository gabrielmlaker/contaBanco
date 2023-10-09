import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da Conta !");
        scanner.next();
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o seu nome !");
        String nomeCliente =scanner.nextLine();
        System.out.println("Por favor, digite o seu saldo !");
        double saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá, "+nomeCliente+
        " obrigado por criar uma conta em nosso banco, sua agência é "+numero+
        " e seu saldo "+saldo+" já está disponível para saque");
    }
}
