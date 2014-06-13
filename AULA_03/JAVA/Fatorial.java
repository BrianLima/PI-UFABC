/* Fatorial.java
 * Calcular o fatorial de um n�mero N
 * Entrada: N (int) 
 * Sa�da: N! 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */


import java.util.Scanner;

class Fatorial{
	public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int N, fatorial;
    N = leitor.nextInt();
    fatorial = 1;  // come�ar do 1 para n�o multiplicar por 0
    for( int i = 1; i<=N; i++ ){
      fatorial = fatorial * i;
    }
    System.out.println(fatorial);

	}
}

