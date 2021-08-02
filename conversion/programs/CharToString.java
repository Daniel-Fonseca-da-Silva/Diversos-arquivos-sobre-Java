package programs;

public class CharToString {

	public static void main(String[] args) {
		// atributos
		char ch = 'c';

		String texto = Character.toString(ch);
		// Alternativo
		// st = String.valueOf(ch);

		System.out.println("A String é: " + texto);
	}// Fim do método main

}// Fim da classe CharToString
