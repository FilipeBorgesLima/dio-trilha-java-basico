package banco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception{
		// TODO: Conhecer e importar a classe Scanner
		Scanner scan = new Scanner(System.in);
		String nomeCliente, agencia;
		int numeroConta;
		double saldo;
		
		//Exibir as mensagens para o usúario
		// Obter pela scanner os valores digitados no terminal
		System.out.println("Por favor, digite o número da Agência!");
		agencia = scan.next();
		
		System.out.println("Por favor, digite o número da sua conta!");
		numeroConta = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Por favor, informe seu nome completo!");
		nomeCliente = scan.nextLine();
		
		System.out.println("Por favor, informe o seu saldo!");
		saldo = scan.nextDouble();
		
		// Exibir a mensagem da conta criada
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo );
		scan.close();
	}

}
