/* AreaFormas.java
 * Implementa��o de algoritmo para c�lculo da
 * �rea e volume de diferentes formas geom�tricas
 * Entrada: dimens�es da forma
 * Sa�da: �rea ou volume
 *
 * Author: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
*/

/* Ex. 05: Area e Volume das Formas
 * Complete o c�digo a seguir para, capturar a dimens�o de diferentes formas 
 * e retornar a �rea ou volume dela (dependendo da forma).
 * � interessante, antes de escrever o c�digo, 
 * escrevar um breve passo a passo do que ser� feito, em forma de coment�rios.
 * Nesse c�digo isso ainda n�o foi feito! Mas j� foi dado um exemplo para o ret�ngulo.
 */

import java.util.Scanner;  // pedindo permiss�o para usar a fun��o Scanner

public class AreaFormas{
	public static void main( String[] args ){
		double area, volume;    // todas as formas podem utilizar essas vari�veis
		double altura, largura; // declare as variaveis a serem utilizadas

		Scanner leitor = new Scanner(System.in); 
		System.out.println("Entre com a altura do ret�ngulo: "); // escreva pedindo a altura
		altura = leitor.nextDouble();
		System.out.println("Entre com a largura do ret�ngulo: "); // escreva pedindo a largura
		largura = leitor.nextDouble();

		area = altura*largura;
		System.out.println("Area do ret�ngulo � "+area); // mostra o resultado

		// tri�ngulo
		
		// circunfer�ncia

		// Cubo

		// Esfera

		// Pir�mide
		
	}
}
