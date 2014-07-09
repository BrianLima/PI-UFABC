package aulasfabricio2;

/* Fibonacci.java
 * Calcular o n�mero de Fibonacci N 
 * Entrada: N (int) 
 * Sa�da: FN 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */


import java.util.Scanner;

class Fibonacci{
	public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int N;
    N = leitor.nextInt();
    int fib = 1; // F(1)
    int fibAnt = 0; // F(0)

    if( N == 0  ){
      System.out.println(0);
    }

    for( int i = 2; i<=N; i++ ){
      int tmp = fib;		
      fib = fib + fibAnt;	// fib = F(N-1) + F(N-2)
      fibAnt = tmp;		// fibAnt = F(N-1)
    }
    System.out.println(fib);

	}
}

