/* Adivinhe.java
 * Sorteie um n�mero de 1 at� 100 
 * e pe�a para o usu�rio adivinhar
 * dando dicas se � > ou <
 * Entrada: n (int) 
 * Sa�da: nada 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */

import java.util.Scanner;
import java.util.Random;

class Adivinhe{
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    Random rnd = new Random();
    int n;
    int x = rnd.nextInt(100) + 1;
    while( true ){
      n = leitor.nextInt();
      if( n > x ){
        System.out.println("O n�mero � menor!");
      }else if( n < x ){
        System.out.println("O n�mero � maior!");
      }else{
        System.out.println("Acertou!");
        break;
      }
    }
  }
}
