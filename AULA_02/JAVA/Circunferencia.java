/* Ex. 03: Circunferencia.java
 * Dado o centro (cx, cy) e o raio (r) de uma circunfer�ncia
 * determinar se um ponto x,y est� dentro ou fora dela
 * Entrada:  cx, cy, r, x, y (double)
 * Sa�da:  Est� dentro ou fora
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */

import java.util.Scanner;

class Circunferencia{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
    double cx, cy, r, x, y;
    System.out.println("Entre com as coordenadas do centro da circunfer�ncia: ");
    cx = leitor.nextDouble();
    cy = leitor.nextDouble();
    System.out.println("Entre com o raio da circunfer�ncia: ");
    r = leitor.nextDouble();

    System.out.println("Entre com as coordenadas do ponto: ");
    x = leitor.nextDouble();
    y = leitor.nextDouble();


	}
}

