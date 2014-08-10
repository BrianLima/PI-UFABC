/* EX. 02: MonteCarlo.java
 * Utilizar o método de
 * Monte Carlo para estimar o
 * valor de pi até determinada precisão.
 *
 * Entrada: precisao (double) 
 * Saída: pi 
 *
 *
 * Defina um círculo de raio 0.5 e centro 
 * (0.5, 0.5) para facilitar.
 * Use Math.random() para gerar um ponto aleatório
 * e Math.PI para obter o valor de pi e
 * Math.abs() para o valor absoluto de um número.
 * A precisão indica qual casa decimal você quer o 
 * valor correto de pi. Ex.:
 * 0.0001 indica que quer precisão até a terceira casa
 * decimal.
 */

import java.util.Scanner;

class MonteCarlo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double precision;
        double Pi = 0;
        double x, y, P;
        double raioquadrado = 0.5 * 0.5;
        int alvo = 0;
        System.out.println("Digite a precisão");
        precision = leitor.nextDouble();
        int i,j = 0;
        double N = Math.round(Pi);
        for ( i = 1; i < precision; i++) {
            x = Math.random();
            y = Math.random();
            if (x * x + y * y < 1)
            {
                j++;
            }
        }
        P = (double) j / (double) i;
        Pi = P * 4; //calculate Pi
        System.out.println(Pi);
    }
}
