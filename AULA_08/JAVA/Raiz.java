/* Raiz.java
 * Encontrar a raiz n do n�mero x
 * utilizando o m�todo de Newton
 *
 * Entrada: y,n (double) 
 * Sa�da: raiz
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */


import java.util.Scanner;

class Raiz{

	// avalia a fun��o f(x) = x^n - y
	public static double f( double x, double y, double n ){
		return Math.pow(x,n)-y;
	}

	// avalia f'(x) = n*x^(n-1)
	public static double df( double x, double n ){
		return Math.pow(x,n-1)*n;
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double y, n;
		y = leitor.nextDouble();
		n = leitor.nextDouble();

		double x = 1, xAnt = 2;

		while( Math.abs(x-xAnt) > 0.01 ){ // at� que altere apenas a segunda casa decimal
			xAnt = x;
			x -= f(x,y,n)/df(x,n);  // m�todo de Newton
		}
		System.out.println("A ra�z " + n + " de " + y + " = " + x);

	}
}

