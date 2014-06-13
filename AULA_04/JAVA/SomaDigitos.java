/* SomaDigitos.java
 * Somar os d�gitos de um n�mero n 
 * Entrada: n (int) 
 * Sa�da: soma (int) 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */

import java.util.Scanner;

class SomaDigitos{
	public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int n,soma;
    n = leitor.nextInt();
    soma = 0;

    while( n!=0 ){	// fa�o at� chegar em 0
      soma += n%10;	// retiro um d�gito
      n/=10;		// reduzo o n�mero
    }
    System.out.println(soma);
  }
}

