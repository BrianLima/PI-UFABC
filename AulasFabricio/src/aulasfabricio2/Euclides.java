/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasfabricio2;

/**
 *
 * @author Brian
 */

import java.util.Scanner;

public class Euclides {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        int a = scan.nextInt();
        System.out.println("Digite o segundo valor");
        int b = scan.nextInt();
        int MDC;
        if (b > a) {
            MDC = CalculaMDC(b, a);
        } else {
            MDC = CalculaMDC(a, b);
        }

        System.out.println("O menor divisor comum entre " + a + " e " + b + " é " + MDC);
    }

    public static int CalculaMDC(int dividendo, int divisor) {
        int resultado = 1;

        while (dividendo % divisor != 0) {
            resultado = dividendo % divisor;
            dividendo = divisor;
            divisor = resultado;
        }
        
        if (dividendo % divisor == 0) {
            resultado = divisor;
        }
        
        return resultado;
    }
}
