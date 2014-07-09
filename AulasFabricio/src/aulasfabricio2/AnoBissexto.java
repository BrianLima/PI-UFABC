package aulasfabricio2;

/* AnoBissexto.java
 * Determinar se um ano � bissexto
 * Entrada: ano (int)
 * Sa�da: se � bissexto ou n�o
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */



import java.util.Scanner;

class AnoBissexto{
	public static void main(String[] args) {
		int ano;	
		Scanner leitor = new Scanner(System.in);

		// captura valores
		System.out.println("Qual ano?: ");
		ano = leitor.nextInt();
		
		if( ano%400 == 0 || (ano%4==0 && ano%100!=0) ){
			System.out.println("� bissexto");
		}else{
			System.out.println("N�o � um bissexto");
		}

	}
}

