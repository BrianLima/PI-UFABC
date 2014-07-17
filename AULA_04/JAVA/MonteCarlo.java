/* EX. 02: MonteCarlo.java
 * Utilizar o m�todo de
 * Monte Carlo para estimar o
 * valor de pi at� determinada precis�o.
 *
 * Entrada: precisao (double) 
 * Sa�da: pi 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 *
 * Defina um c�rculo de raio 0.5 e centro 
 * (0.5, 0.5) para facilitar.
 * Use Math.random() para gerar um ponto aleat�rio
 * e Math.PI para obter o valor de pi e
 * Math.abs() para o valor absoluto de um n�mero.
 * A precis�o indica qual casa decimal voc� quer o 
 * valor correto de pi. Ex.:
 * 0.0001 indica que quer precis�o at� a terceira casa
 * decimal.
 */

import java.util.Scanner;

class MonteCarlo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double precisao;
        double pi = 0;
        double x, y;
        double raioquadrado = 0.5 * 0.5;
        int alvo = 0;
        System.out.println("Digite a precis�o");
        precisao = leitor.nextDouble();
        
        pi = Math.PI;
        double N = Math.round(pi);
        
        
        
    }
}
