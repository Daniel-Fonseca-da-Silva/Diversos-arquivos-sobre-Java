import java.util.Scanner;

public class SwapTwoNumbers{
	public static void main(String[] args)
	{
		int a, b, guarda;

		Scanner s = new Scanner(System.in);
		System.out.println("Entre com um valor para a :");
		a = s.nextInt();
		System.out.println("Entre com um valor para b :");
		b = s.nextInt();

		guarda = a;//Guardei o valor de 10 na variável guarda
		a = b;//Passei o valor de 20 para a guarda
		b = guarda;//Passei o valor de 10 para b
		System.out.println("Valores em a: " + a);
		System.out.println("Valor em b: " + b);

	}//Fim do método
}//Fim da classe SwapTwoNumbers
