public class StringToArray{
	public static void main(String[] args)
	{
		String texto = "Olá mundo!";
		char[] textoArray;

		textoArray = texto.toCharArray();

		for(int index = 0; index < textoArray.length; index++)
		{
			System.out.println(textoArray[index]);
		}
	}//Fim do método
}//fim da classe StringToArray
