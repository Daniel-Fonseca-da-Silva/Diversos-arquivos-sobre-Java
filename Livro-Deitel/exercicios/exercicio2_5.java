import java.util.Scanner;

public class exercicio2_5
{
   public static void main(String[] args)
   {

      Scanner input = new Scanner(System.in);

      int x, y, z, result;
      x = y = z = result = 0;

      System.out.println("Insira o 1° inteiro");
      x = input.nextInt();

      System.out.println("Insira o 2° inteiro");
      y = input.nextInt();

      System.out.println("Insira o 3° inteiro");
      z = input.nextInt();

      result = x * y * z;

      System.out.printf("O produto é %d%n", result);
   }
}
