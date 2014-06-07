/* Media.java
 * Implementa��o de algoritmo para c�lculo de
 * m�dia aritm�tica entre dois n�meros.
 * Entrada: double x, y
 * Sa�da: M�dia m
 */

import java.util.Scanner;  // pedindo permiss�o para usar a fun��o Scanner

class Media{
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
