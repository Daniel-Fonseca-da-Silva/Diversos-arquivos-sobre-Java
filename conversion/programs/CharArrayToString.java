package programs;

public class CharArrayToString {
	public static void main(String[] args) {
		// Atributo ch vetor de char
		char[] ch = { 'a', 'e', 'i', 'o', 'u' };

		String texto_0 = String.valueOf(ch);
		String texto_1 = new String(ch);

		System.out.println(texto_0);
		System.out.println(texto_1);
	}// Fim do método main
}// Fim da classe CharArrayToString
