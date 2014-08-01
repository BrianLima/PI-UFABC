package aulasfabricio2;

/* EX. 03: Binomial.java
 * Dado n e k, calcular o coeficiente
 * binomial: n!/(k!(n-k)!).
 *
 * Entrada: n,k (int) 
 * Saída: Bin(n,k) 
 *
 * Autor: Brian Lima
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 *
 * Existem diversas maneiras de fazer isso.
 * Qual é a melhor?
 * Não esqueçam de verificar se n > k.
 */
import java.util.Scanner;

class Binomial {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = 1, k = 2;
        int result = 0;
        while (n < k) {
            System.out.println("Digite os valores para N e K");
            n = leitor.nextInt();
            k = leitor.nextInt();
            if (n < k) {
                System.out.println("Os valores de N e K não são válidos");
            }
        }
        result = fatorial(n) / fatorial(k) * fatorial(n - k);
        System.out.println(result);
    }

    public static int fatorial(int n) {
        int m = n - 1;

        while (m > 1) {
            n = m * (m - 1);
            m = m - 1;
        }

        return n;
    }
}
