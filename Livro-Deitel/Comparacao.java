//Compara inteiros utilizando instruções if, operadores relacionais
//e operadores de igualdade
import java.util.Scanner;//Programa utiliza a classe  Scanner
public class Comparacao
{
   //método main inicia a execução do aplicativo Java
   public static void main(String[] args)
   {
      //Cria Scanner para obter entrada a partir da linha de comando
      Scanner input = new Scanner(System.in);

      int number1;//Primeiro número a comparar
      int number2;//Segundo número a comparar

      System.out.print("Entre com o primeiro inteiro: ");//Prompt
      number1 = input.nextInt();//Lê o primeiro número fornecido pelo usuário
      System.out.print("Entre com o segundo inteiro: ");
      number2 = input.nextInt();//Lê o segundo número fornecido pelo usuário
      
      //Operador relacional
      if(number1 == number2)
         System.out.printf("%d == %d%n", number1, number2);
      if(number1 != number2)
         System.out.printf("%d != %d%n", number1, number2);
      if(number1 < number2)
	 System.out.printf("%d < %d%n", number1, number2);
      if(number1 > number2)
	 System.out.printf("%d > %d%n", number1, number2);
      if(number1 <= number2)
	 System.out.printf("%d <= %d%n", number1, number2);
      if(number1 >= number2)
         System.out.printf("%d >= %d%n", number1, number2);
      //
   }//Fim do método main
}//Fim da classe Comparacao
