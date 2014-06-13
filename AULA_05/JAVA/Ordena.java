/* EX. 03: Ordena.java
 * Dada uma lista de n�meros
 * ordene essa lista utilizando
 * m�todo descrito em aula.
 *
 * Entrada: double [] x
 * Sa�da: double [] x 
 * Autor: Fabr�cio Olivetti de Fran�a
 *
 * Dica: use x.length para determinar
 * o tamanho da lista x
 */

import java.io.File;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;

class Ordena{
	public static void main(String[] args) throws FileNotFoundException {

		Scanner leitor = new Scanner(new File("lista.csv")); // agora vou ler do arquivo
		leitor.useDelimiter("\\s*;\\s*|\\n|\\r|\\r\\n");
		int n = leitor.nextInt();
		Random rnd = new Random();

		double [] x = new double[n];
		for( int i=0; i<n; i++ ){
			x[i] = leitor.nextDouble();
		}
		leitor.close();


	}
}

