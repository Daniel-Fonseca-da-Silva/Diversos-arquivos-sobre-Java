import java.util.Scanner;

public class exercicio2_3
{
   public static void main(String[] args)
   {

      Scanner input = new Scanner(System.in);//Cria Scanner

      int c, thisIsAVariable, q76354, number, value = 0;//variaveis locais do metodo

      System.out.println("Entre com um inteiro");
      value = input.nextInt();

      System.out.println("Este é um programa em Java");
      System.out.printf("%s%n%s%n", "Este é um programa", "em Java");

      if(value != 7)
         System.out.println("A variavel value não é igual a 7");
   }
}
