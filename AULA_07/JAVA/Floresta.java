/* EX. 01: Floresta.java
 * Inc�ndio em uma floresta.
 * Entrada: int n 
 * Sa�da: int [][] F 
 * Autor: Fabr�cio Olivetti de Fran�a
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;

class Floresta{
	public static void main(String[] args) throws FileNotFoundException {

		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		double p = leitor.nextDouble();
		int [][] F = new int [n][n];  // a floresta � uma matriz quadrada

		// Floresta inicialmente vazia

		// Plantar alguams �rvores de acordo com a probabilidade p

		// Vou botar fogo na primeira �rvore que encontrar

		// Dica: a vizinhan�a de uma �rvore (i,j) � definida por (i+k1,j+k2) com k1,k2 = -1..1

	}
}

