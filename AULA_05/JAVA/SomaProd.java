/* EX. 01: SomaProd.java
 * Dada uma lista de n�meros
 * calcular a somat�ria e 
 * produt�ria dos valores dessa lista
 * Entrada: double [] x
 * Sa�da: double soma, prod 
 * Autor: Fabr�cio Olivetti de Fran�a
 */

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class SomaProd{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner leitor = new Scanner(new File("lista.csv")); // agora vou ler do arquivo
		leitor.useDelimiter("\\s*;\\s*|\\r?\\n"); // separado por v�rgula
		int n = leitor.nextInt();

		double [] x = new double[n];
		for( int i=0; i<n; i++ ){
			x[i] = leitor.nextDouble();
		}
		leitor.close();


	}
}

