import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingFromConsole{

	public static void main(String[] args) throws IOException
	{
		System.out.println("Entre com o texto e pressione ");
		BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));
		String texto = leitura.readLine();
		System.out.println("Você entrou com " + texto);

		leitura.close();
	}//Fim do método

}//Fim da classe ReadingFromConsole
