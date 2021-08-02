public class lacoWhile
{
   public static void main(String[] args)
   {
      //Variáveis declaradas
      int num = 43;
      int max = num + 10;
      int contador = 0;
      //Variável max recebe num que vale 43 + 10 que é igual a 53
      

      //Enquanto num que 43 for menor que max que vale 53 repita
      while(num < max)
      {
	 contador = contador + 1;//contador vale 0 recebe 1 agora e conta até 10
	 System.out.println(contador);

	 /*Formas de atribuir valores para contadores de laço
	 contador++; 
	 contador += 1; Soma e atribui ao mesmo tempo
	 contador = contador + 1; Permite ter controle sobre o valor de atribuição
	 */

         System.out.println(num);
	 num = num + 1;//Incremente num que vale 43 + 1 toda vez rodar o loop
      }//fim do enquanto


   }//Fim do método	   
}//Fim da classe lacoWhile
