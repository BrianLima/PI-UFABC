/* EX. 04: ProdutoVetores.java
 * Dada duas listas de valores
 * num�ricos, calcule o produto 
 * elemento a elemento entre elas.
 *
 * Entrada: double [] x, double [] y
 * Sa�da: double [] z 
 * Autor: Fabr�cio Olivetti de Fran�a
 */

import java.io.File;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;

class ProdutoVetores{
	public static void main(String[] args) throws FileNotFoundException {

		Scanner leitor = new Scanner(new File("lista.csv")); // agora vou ler do arquivo
		leitor.useDelimiter("\\s*;\\s*|\\r|\\n|\\r\\n"); // separado por v�rgula
		int n = leitor.nextInt();
		Random rnd = new Random();
		double [] x = new double[n];
		double [] y = new double[n];

		for( int i=0; i<n; i++ ){
			x[i] = leitor.nextDouble();
		}
		for( int i=0; i<n; i++ ){
			y[i] = leitor.nextDouble();
		}
		leitor.close();

	}
}

