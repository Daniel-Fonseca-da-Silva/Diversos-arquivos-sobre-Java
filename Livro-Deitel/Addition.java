//Programa de adição que insere dois números, então exibe a soma deles

import java.util.Scanner; //Programa utiliza a classe Scanner

public class Addition {
   //Metódo main inicia a execução do aplicativo Java
   public static void main(String[] args)
   {
      //Cria um Scanner para obter entrada a partir da janela de comando
      Scanner input = new Scanner(System.in);

      //Declarações de variáveis
      int number1,//Primeiro número a somar
      number2,//Segundo número a somar
      sum;//Soma de number1 e number2
      //
      System.out.print("Entre com o primeiro número: ");//Terminal
      number1 = input.nextInt();//Lê o primeiro número fornecido pelo usuário

      System.out.print("Entre com o segundo número: ");//Terminal
      number2 = input.nextInt();//Lê o segundo número fornecido pelo usuário

      sum = number1 + number2;// Soma os números, depois guarda na variável sum

      System.out.printf("Soma é %d%n", sum);//Exibe o valor armazenado em sum 

   }//Fim do método main
}//Fim da classe Addition
