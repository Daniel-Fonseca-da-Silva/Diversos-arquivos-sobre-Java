import java.util.Random;

public class SomaDeElementoNoArray
{
	public static void main(String[] args)
	{
		int[] meuArray = new int[20];
		long soma = 0;

		Random aleatorio = new Random();//Construtor

		for(int i = 0; i < meuArray.length; i++)
		{
			meuArray[i] = aleatorio.nextInt(10000);
		}

		for(int i = 0; i < meuArray.length; i++)
		{
			soma = soma + meuArray[i];
		}

		System.out.println("Soma = " + soma);
	}//Fim do método	
}//Fim da classe SomaDeElementoNoArray

