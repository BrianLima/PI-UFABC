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

public class NvaloresArray {

    public static void main(String args[]) {
        System.out.println("Digite o tamanho do vetor");
        Scanner scan = new Scanner(System.in);
        double[] values = new double[scan.nextInt()];
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            System.out.println("Digite o valor do numero " + (i + 1));
            values[i] = scan.nextDouble();
            sum += values[i];
        }
        float med = sum / values.length;
        System.out.println("A média dos valores digitados é " + med + "E os valores maiores que a média são: ");
        for (int i = 0; i < values.length; i++) {
            if (values[i] > med) {
                System.out.println(values[i]);
            }
        }
    }
}
