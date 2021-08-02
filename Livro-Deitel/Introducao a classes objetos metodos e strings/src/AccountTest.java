// Classe driver ou condutora
// Cria e manipula um objeto Account.
// Usando o construtor de Account para inicializar a instância name
// variável no momento em que cada objeto Account é criado.
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		// Cria dois objetos Account
		Account account1 = new Account("Daniel F S", 50.00);
		Account account2 = new Account("Marie Jhonsom", -7.53);
		
		// Exibe o valor inicial de cada objeto
		
		System.out.printf("%s balanço: $%.2f %n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balanço: $%.2f %n%n",
				account2.getName(), account2.getBalance());
		
		//Cria um Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		// Conta1
		System.out.print("Entre com a quantidade do deposito para conta1: ");
		double depositAmount = input.nextDouble();//Obtém entrada do usuário
		System.out.printf("%nAdicionando %.2f para conta1 balanço %n%n",
			depositAmount);
		account1.deposit(depositAmount);// Adiciona o saldo de account1
		
		// Exibe saldos
		System.out.printf("%s balanço: $%.2f %n", 
			account1.getName(), account1.getBalance());
		System.out.printf("%s balanço: $%.2f %n%n",
			account2.getName(), account2.getBalance());
		
		
		// Conta2
		System.out.print("Entre com a quantidade do deposito para conta2: ");
		depositAmount = input.nextDouble();//Obtém entrada do usuário
		System.out.printf("%nAdicionando %.2f para conta2 balanço %n%n",
			depositAmount);
		account2.deposit(depositAmount);// Adiciona o saldo de account1
		
		// Exibe saldos
		System.out.printf("%s balanço: $%.2f %n", 
			account1.getName(), account1.getBalance());
		System.out.printf("%s balanço: $%.2f %n%n",
			account2.getName(), account2.getBalance());
		
	}// Fim do metódo main
}// Fim da classe AccountTest
