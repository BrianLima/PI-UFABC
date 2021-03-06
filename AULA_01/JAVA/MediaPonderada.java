/* MediaPonderada.java
 * Implementa��o de algoritmo para c�lculo de
 * m�dia aritm�tica entre dois n�meros com peso w e (1-w) respectivamente.
 * Entrada: double x, y, w
 *
 * Author: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 * Sa�da: M�dia m
 */

/* Ex. 02: Media ponderada
 * Altere o c�digo em Java para calcular a m�dia entre dois n�meros para
 * capturar um terceiro valor w (pe�a gentilmente para o usu�rio entrar com
 * um valor entre 0 e 1), e us�-lo para ponderar a m�dia da seguinte maneira:
 * m = w*x + (1-w)*y
 */

import java.util.Scanner;  // pedindo permiss�o para usar a fun��o Scanner

public class MediaPonderada{
	public static void main( String[] args ){
		double x,y; // entrada
		double m;   // media
		Scanner leitor = new Scanner(System.in); // para pegar entrada do usu�rio
		System.out.print("Entre com o valor de x:");
		x = leitor.nextDouble();
		System.out.print("Entre com o valor de y:");
		y = leitor.nextDouble();

		m = (x+y)/2;

		System.out.println("A m�dia entre "+x+" e "+y+" �: "+m);
		
	}
}
