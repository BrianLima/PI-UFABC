/* Strings.java
 * realizar invers�o da String
 * checar se ela � um pangram
 * contar frequ�ncia de cada letra
 * calcular entropia
 * Entrada: String s 
 * Sa�da: -- 
 * Autor: Fabr�cio Olivetti de Fran�a
 */

import java.util.Scanner;
import java.util.Random;

class Strings{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String s = leitor.nextLine().toLowerCase(); // vamos usar apenas min�sculas
		double [] freq = new double[26]; //26 letras do alfabeto

		for( int i=0;i<26;i++ )
			freq[i]=0;  // come�ar a contar do zero

		char [] inv = new char[s.length()];
		for( int i=0;i<s.length();i++ ){
			inv[i] = s.charAt(s.length()-i-1);
			freq[ (int) s.charAt(i)-'a' ]++; //  'a' � um s�mbolo da tabela ASCII com um valor num�rico correspondente, qq letra - 'a' resulta em um n�mero de 0 a 25
		}
		String inverso = new String(inv);
		System.out.println( inverso );

		boolean pangram = true;   // vamos assumir que � verdadeiro
		for( int i=0; i<26; i++ ){
			if( freq[i]==0 ){  // se uma letra n�o foi encontrada, � falso! Termina a busca
				pangram = false;
				break;
			}
		}
		if( pangram ){
			System.out.println("� um pangram");
		}else{
			System.out.println("N�o � um pangram");
		}

		double entropia = 0.0;
		for( int i=0;i<26;i++ ){
			if(freq[i]>0){  // para toda letra com frequ�ncia > 0, entropia � -freq/n * log(f/n, 2) (log na base 2)
				entropia -= (freq[i]/s.length())*Math.log(freq[i]/s.length())/Math.log(2.0);
			}
		}
		System.out.println("Entropia = "+entropia);

	}
}

