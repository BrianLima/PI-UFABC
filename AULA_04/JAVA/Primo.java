/* Primo.java
 * Verificar se um n�mero n � primo 
 * Entrada: n (int) 
 * Sa�da: � primo ou n�o 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */

import java.util.Scanner;

class Primo{
	public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int n;
    n = leitor.nextInt();
    int i = n-1;
    boolean primo = true; //vamos assumir que � primo

    while( i>1 ){	// n�o verifica o 1, pois vai ser divis�vel
      if( n%i == 0 ){
        primo = false;    // se achar um n�mero que n � divis�vel, n�o precisa continuar
        break;
      }
      i--;
    }
    if( primo ){
      System.out.println("� primo");
    }else{
      System.out.println("N�o � primo");
    }
  }
}

