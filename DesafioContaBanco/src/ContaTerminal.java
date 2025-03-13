import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuário

        // Obter pela Scanner os valores digitados no terminal

        // Exibir a mensagem da conta criada
        
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);


        // int numeroCliente = 1021;
        // String agenciaCliente = "067-8";
        // String nomeCliente = "Mario Andrade";
        // double saldoCliente = 237.48;

        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número do Cliente !");
        int numeroCliente = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência !");
        String agenciaCliente = scanner.next();

        System.out.println("Por favor, digite o saldo do Cliente !");
        double saldoCliente = scanner.nextDouble();


        System.out.println("Olá " 
        + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agenciaCliente + ", conta " 
        + numeroCliente + " e seu saldo R$" 
        + saldoCliente + " já está dísponivel para saque.");





    }
}

