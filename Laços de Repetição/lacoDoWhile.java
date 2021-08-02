public class lacoDoWhile{
   public static void main(String[] args)
   {
      int num = 43;
      int max = num + 10;//Total 53
      int contador = 0;

      do//Repita
      {
	 contador += 1;//Conta de 1 até 10
	 System.out.println(contador);
         System.out.println(num);
	 num = num + 1;//incrementa 1 em 43 10 vezes até 53
      }
      while((num < max) || (53 > num));//Enquanto 43 for menor que 53 ou 53 for maior que 43 siga comparando
   }//Fim do metódo
}//Fim da classe lacoDoWhile
