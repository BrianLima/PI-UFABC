package aulasfabricio2;

/* Ex. 07: EquacaoSegundoGrau.java
 * Dados a,b,c (double) de uma equa��o do segundo grau
 * resolver essa equa��o para os tipos reais e complexos
 * Entrada: a,b,c (double)
 * Sa�da: x0, x1 (double)
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */
import java.util.Scanner;

class EquacaoSegundoGrau {

    public static void main(String[] args) {
        double a, b, c;
        double x0, x1, delta;
        Scanner leitor = new Scanner(System.in);

        // captura valores
        System.out.println("Digite a, b e c: ");
        a = leitor.nextDouble();
        b = leitor.nextDouble();
        c = leitor.nextDouble();

        delta = Math.pow(b, 2);
        delta = delta - 4 * a * c;
        x0 = (-b - Math.sqrt(delta)) / 2 * a;
        if (delta > 0) {
            System.out.println("A equação tem uma raiz real e o resultado é " + x0);
        } else if (0 > delta) {
            x1 = (-b + Math.sqrt(delta)) / 2 * a;
            System.out.println("A Equação tem duas raízes, x0 é " + x0 + " e o resultado de x1 é " + x1);
        } else {
            System.out.println("Essa equação não tem raízes reais");
        }
    }
}
