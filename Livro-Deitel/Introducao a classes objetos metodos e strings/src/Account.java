// Classe Account que contém uma variável de instância name
// e métodos para configurar e obter seu valor. 

public class Account {

	private String name;// Variável de instância
	private double balance;// Variável de instância
	
	// Construtor de Account que recebe dois parâmetros
	public Account(String name, double balance)
	{
		this.name = name;// Atribui name a variável de instância name
		
		// Valida que o balance é maior que 0.0; se não for,
		// a variável de instância balance mantém seu valor inicial padrão de 0.0
		if(balance > 0.0)// Se o saldo for válido
			this.balance = balance;// O Atribui à variável de instância balance
	}
	
	// Método que deposita(adiciona) apenas uma quantia válida no saldo
	public void deposit(double depositAmount)
	{
		if(depositAmount > 0.0)// Se depositAmount for válido
			balance = balance + depositAmount;// O adiciona ao saldo
	}
	
	//Método retorna o saldo da conta
	public double getBalance()
	{
		return balance;
	}

	// Método que define o nome
	public void setName(String nome) 
	{

		this.name = nome;
		/*
		 * atribui o valor do parâmetro name (uma String) à variável de instância name
		 * da classe, armazenando assim o nome da conta no objeto
		 */
	}

	// Método que recuperar o nome
	public String getName() 
	{
		return name;// a palavra-chave return retorna o valor de name
		// para o método chamador

	}// Fim do método
}// Fim da classe Account
