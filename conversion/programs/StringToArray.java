package programs;

import java.util.Arrays;

public class StringToArray {
	public static void main(String[] args) {
		String texto = "Isto é grande";

		char[] meuArray = texto.toCharArray();
		System.out.println(Arrays.toString(meuArray));
	}// Fim do método main
}// Fim da classe StringToArray
