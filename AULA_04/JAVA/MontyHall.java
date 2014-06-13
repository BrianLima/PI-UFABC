/* EX. 04� MontyHall.java
 * Fazer uma simula��o de Monte Carlo
 * para estimar a validade do paradoxo 
 * de Monty Hall (trocar de porta leva
 * a probabilidade de 2/3 de vit�ria.
 *
 * Entrada: partidas (int) 
 * Sa�da: pTroca, pNaoTroca 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 *
 * Dica:
 * use o tipo Random para gerar as escolhas
 * rnd.nextInt(3) retornar� um n�mero de 0 a 2
 */


import java.util.Scanner;
import java.util.Random;

class MontyHall{
	public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int porta,escolha;
    int partidas = leitor.nextInt();
    int contaVitorias, contaDerrotas;
    Random rnd = new Random();
    double pTroca=0, pNaoTroca=0;

  }
}

