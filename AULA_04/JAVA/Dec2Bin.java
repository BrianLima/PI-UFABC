/* Dec2Bin.java
 * Converter um n�mero decimal 
 * para seu equivalente em bin�rio 
 * Entrada: n (int) 
 * Sa�da: bin 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */

import java.util.Scanner;

class Dec2Bin{
	public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int n,bin;
    n = leitor.nextInt();
    int i = 1;
    bin = 0;

    while( n != 0 ){
      bin += (n%2)*i;  //cada bit extra�do vai ocupar um d�gito de um n�mero decimal
      i *= 10;  // para isso multiplico ele por pot�ncias de dez
      n /= 2;
    }
    System.out.println(bin);

  }
}

