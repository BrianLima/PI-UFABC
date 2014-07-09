package aulasfabricio2;

/* Ex. 06: Calculadora.java
 * Dados dois operandos e um operador, realizar a opera��o correspondente
 * Entrada: x,y (double), op (char)
 * Sa�da: resultado da opera��o 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 *
 *
 * Dica: utilize o tipo char para capturar o operador
 * char op;
 * op = leitor.next().charAt(0);
 * if( op == '+' ) // fa�a opera��o de soma
 */

import java.util.Scanner;

class Calculadora{
	public static void main(String[] args) {
		double x,y;
    char op;
		Scanner leitor = new Scanner(System.in);

		// captura valores
		System.out.println("Digite os operandos: ");
		x = leitor.nextDouble();
    y = leitor.nextDouble();
		System.out.println("Digite a opera��o: ");
    op = leitor.next().charAt(0);


	}
}

