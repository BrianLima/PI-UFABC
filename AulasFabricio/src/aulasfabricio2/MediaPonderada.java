package aulasfabricio2;

/* MediaPonderada.java
 * Implementa��o de algoritmo para c�lculo de
 * m�dia aritm�tica entre dois n�meros com peso w e (1-w) 
 * respectivamente. Qualquer valor w fora do esperado, deve 
 * assumir o valor padr�o w = 0.5
 * Entrada: double x, y, w
 * Sa�da: M�dia m
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */

import java.util.Scanner;  // pedindo permiss�o para usar a fun��o Scanner

public class MediaPonderada{
	public static void main( String[] args ){
		double x,y, w; // entrada
		double m;   // media
		Scanner leitor = new Scanner(System.in); // para pegar entrada do usu�rio
		System.out.print("Entre com o valor de x:");
		x = leitor.nextDouble();
		System.out.print("Entre com o valor de y:");
		y = leitor.nextDouble();
		System.out.print("Entre com o valor de w (0<=w<=1): ");
		w = leitor.nextDouble();

		if( w < 0.0 || w > 1.0 ){ // se w est� fora da faixa, assume valor padr�o
			w = 0.5;
		}

		m = ( w*x + (1-w)*y ) ;

		System.out.println("A m�dia ponderada entre "+x+" e "+y+" �: "+m);
		
	}
}
