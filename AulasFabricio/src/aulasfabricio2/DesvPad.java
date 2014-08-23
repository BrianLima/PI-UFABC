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
public class DesvPad {

    public static void main(String args[]) {
        System.out.println("Digite o tamanho do vetor");
        Scanner scan = new Scanner(System.in);
        int[] values = new int[scan.nextInt()];
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            System.out.println("Digite o valor do numero " + (i + 1));
            values[i] = scan.nextInt();
            sum += values[i];
        }
        float media = sum / values.length;
        float somatoria = 0;
        for (int i = 0; i < values.length; i++) {
            somatoria += Math.pow(values[i] - media, 2);
        }
        double razao = 1 / values.length;
        double desvpad = Math.sqrt(razao) * somatoria;
        for (int i = 0; i < values.length; i++) {
            if (values[i] - desvpad > desvpad || desvpad > values[i] + desvpad) {
                System.out.println(values[i] + " é maior que o desvio padrão");
            }
        }
    }
}
