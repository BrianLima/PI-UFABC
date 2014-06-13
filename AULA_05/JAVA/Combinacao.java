/* Ex. 05: Combinacao.java
 * Dado m e n, imprimir todas
 * as combina��es de tamanho m
 * dos inteiros de 0 a n-1 em ordem
 * crescente e sem repeti��o de n�meros.
 *
 * Entrada: m,n (int) 
 * Sa�da: combina��es 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */

import java.util.Scanner;

class Combinacao{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int m,n;
		m = leitor.nextInt();
		n = leitor.nextInt();

		int [] comb = new int[m]; // as combina��es v�o ter tamanho m

		for( int i=0;i<m;++i ){ // primeira combina��o trivial: 0..m-1
			comb[i]=i;
			System.out.print(i+" ");
		}
		System.out.println("");


	}
}

