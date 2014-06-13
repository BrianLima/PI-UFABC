/* EX. 02: Shuffle.java
 * Dada uma lista de n�meros
 * embaralhe o conte�d dessa lista
 * Entrada: double [] x
 * Sa�da: double [] x 
 * Autor: Fabr�cio Olivetti de Fran�a
 *
 * DICA:
 * use o tipo Random para sortear
 * a posi��o de troca
 */

import java.io.File;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;

class Shuffle{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner leitor = new Scanner(new File("lista.csv")); // agora vou ler do arquivo
		leitor.useDelimiter("\\s*;\\s*|\\r?\\n"); // separado por v�rgula
		int n = leitor.nextInt();
		Random rnd = new Random();
		double [] x = new double[n];
		for( int i=0; i<n; i++ ){
			x[i] = leitor.nextDouble();
		}
		leitor.close();



	}
}

