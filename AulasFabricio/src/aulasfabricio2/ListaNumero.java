/* ListaNumero.java
 * Listar os N primeiros n�meros naturais separados por v�rgula 
 * Entrada: N (int) 
 * Sa�da: lista separado por v�rgula 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */


import java.util.Scanner;

class ListaNumero{
	public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int N;
    N = leitor.nextInt();
    for( int i = 0; i<=N; i++ ){
      System.out.print(i);
      if( i == N ) break;  // se s� tem uma instru��o n�o preciso de {}
      System.out.print(",");
    }
    System.out.println("");

	}
}

