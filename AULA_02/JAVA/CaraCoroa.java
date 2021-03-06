/* Ex. 01: CaraCoroa.java
 * Dada duas entradas nos valores 0 (cara), 1 (coroa)  
 * sortear o resultado e mostrar o resultado
 * Entrada: jogada (int)
 * Sa�da:  ganhou ou perdeu
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 *
 *
 * Utilize a fun��o Math.random() que retorna
 * um valor aleat�rio entre 0 e 1 para sortear
 * o resultado.
 * Assuma valores menores que 0.5 como cara
 * e maiores ou igual como coroa.
 */

import java.util.Scanner;

class CaraCoroa{
	public static void main(String[] args) {
    int jogada;
    double prob,sorteio;
		Scanner leitor = new Scanner(System.in);

		// captura valores
		System.out.println("Cara (0) ou coroa (1)?: ");
		jogada = leitor.nextInt();
                sorteio = Math.random();
                if(sorteio > .5)
                {
                    if(jogada == 1)
                    { 
                        System.out.println("O resultado foi cara! Voc� venceu!");
                    }
                    else
                    {
                        System.out.println("O resultado foi cara! voc� perdeu");
                    }
                }
                else
                {
                    if (jogada < .5)
                    {
                        System.out.println("O resultado foi coroa, voc� venceu!");
                    }
                    else 
                    {
                        System.out.println("O resultado foi coroa, voc� perdeu");
                    }
                }
	}
}

