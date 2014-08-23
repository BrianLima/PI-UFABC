/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulasfabricio2;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class VerificaVetor {
    public static void main(String args[]){
        System.out.println("Digite o tamanho do vetor");
        Scanner scan = new Scanner(System.in);
        int[] values = new int[scan.nextInt()];
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            System.out.println("Digite o valor do numero " + (i + 1));
            values[i] = scan.nextInt();
        }
        System.out.println("Digite o valor do numero para verificar");
            int verify = scan.nextInt();
        for (int i = 0; i < values.length; i++) {
            if (verify == values[i]) {
                System.out.println("A coleção de numeros digitadas contem o numero requisitado");
            }
        }
    }
}
