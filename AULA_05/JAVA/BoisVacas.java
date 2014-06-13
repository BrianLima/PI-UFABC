/* EX. 06: BoisVacas.java
 * sortear um n�mero aleat�rio
 * de 4 d�gitos. A cada tentativa
 * do usu�rio adivinhar, ser� contabilizado
 * quantos d�gitos ele acertou
 * na ordem correta (bois) e quantos ele
 * acertou fora da ordem (vaca).
 *
 * Entrada: n (int) n�mero de 4 d�gitos 
 * Sa�da: nBois, nVacas (int)
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 *
 * DICA:
 * Use vetores de tal forma que possa
 * adaptar o jogo para N d�gitos.
 */

import java.util.Scanner;
import java.util.Random;

class BoisVacas{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int [] segredo = new int[4];

		Random rnd = new Random();
		int n = rnd.nextInt(10000); // n�mero com 4 d�gitos, de 0 at� 9999
		for( int i=3;i>=0;i-- ){  // vamos colocar o n�mero em um vetor
			// fa�a!
		}


	}
}

