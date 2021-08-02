public class lacoFor{
   public static void main(String[] args)
   {
      int num = 43;
      int max = num + 10;//53
      int contador = 0;

      for(num = 43; num < max; num++)//Repita e compare se 43 é menor que 53 se true incremente 1 em 43 até 53
      {
	 System.out.println(contador);
         System.out.println(num);
	 contador = contador + 1;
      }
   }
}//Fim da classe lacoFor
