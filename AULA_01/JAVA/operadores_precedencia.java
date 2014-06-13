/* operadores_precedencia.java
 * Demonstra��o da preced�ncia dos operadores em Java
 * Entrada: nenhum
 * Sa�da: nenhum
 *
 * Author: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */

public class operadores_precedencia{
	public static void main(String[] args) {
		int a=20;
		int b=10;
		int c=15;
		int d=5;

		System.out.println( a+b*c-a+b*d ); // o que vai dar de resultado?
		System.out.println( a + (b*c) - a + (b*d) ); //Fica f�cil ver a ordem de opera��es
		int e = (a + b) * c / d;
		System.out.println("Valor de (a + b) * c / d = " + e);

		e = ( (a+b) * c) / d;
		System.out.println("Valor de ((a + b) * c) / d = " + e);
		
		e = (a+b) * (c/d);
		System.out.println("Valor de (a + b) * (c / d) = " + e);

		e = a + (b * c) / d;
		System.out.println("Valor de a + (b * c) / d = " + e);

	}
}

