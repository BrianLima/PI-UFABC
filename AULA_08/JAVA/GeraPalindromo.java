/* GeraPalindromo.java
 * Crie uma rotina que retorne o inverso de um n�mero
 * Use tal rotina para gerar um palindromo.
 *
 * Entrada: n (int) 
 * Sa�da: palindromo
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */


import java.util.Scanner;

class GeraPalindromo{

	// subrotina para  gerar o inverso de um n�mero
	public static int Inverso( int n ){
		int inverso=0;
		while( n!=0 ){
			inverso = inverso*10 + (n%10);
			n /= 10;
		}
		return inverso;
	}

	// principal
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n;
		n = leitor.nextInt();
		int maxTentativas = 100;
		int i=0;
		int inv=0;
		for( ;i<maxTentativas;i++ ){
			inv = Inverso(n); // inverte o n�mero
			if( n == inv ){ // se for pal�ndromo, beleza
				break;
			}
			n += inv; // sen�o soma n + inverso
		}
		if( inv == n ){
			System.out.println("Obtive "+n+ " ap�s "+i+" tentativas");
		}else{
			System.out.println("Desisto");
		}

	}
}

