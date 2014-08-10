/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulasfabricio2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class MinimoInfinitoPosicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int media = 0;

        System.out.println("Digite a quantidade de numeros que você deseja calcular:");
        int n = scanner.nextInt();
        int[] x = new int[n];

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o " + i + "º numero");
            x[i - 1] = scanner.nextInt();
        }
        
        int[] y = x.clone();
        Arrays.sort(x);
        int pos = 0;
        
        for (int i = 0; i < x.length; i++) {
            if(x[0] == y[i]){
                pos = i + 1;
            }
        }

        System.out.println("O valor minimo digitado é " + x[0] + " e foi encontrado na " + pos + " Posição");
    }
}
