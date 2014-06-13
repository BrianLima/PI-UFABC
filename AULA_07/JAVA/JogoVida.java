/* EX. 02: JogoVida.java
 * Implementar o jogo da vida seguindo 
 * as regras de sobreviv�ncia.
 * Entrada: int n 
 * Sa�da: int [][] F 
 * Autor: Fabr�cio Olivetti de Fran�a
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;

class JogoVida{
	public static void main(String[] args) throws FileNotFoundException {

		Scanner leitor = new Scanner(new File("vidainicial.csv")); // coloque a configura��o inicial em um arquivo
		leitor.useDelimiter("\\s*;\\s*|\\r?\\n");
		int n = leitor.nextInt();
		int [][] A = new int [n][n];

		for( int i=0; i<n; i++ ){
			for( int j=0; j<n; j++ ){
				A[i][j] = leitor.nextInt();
			}
		}
		leitor.close();

		leitor = new Scanner(System.in);
		int maxit = leitor.nextInt();

		// vamos ver o que acontece
		PrintWriter saida = new PrintWriter("vidafinal.csv"); // grava a configura��o final em um outro arquivo
		for( int i=0; i<n;i++ ){
			for( int j=0; j<n-1; j++ ){
				saida.print(A[i][j]);
			}
			saida.println(A[i][n-1]);
		}
		saida.close();


	}
}

