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
public class RetornaDoisVetores {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros que você deseja calcular no primeiro vetor:");
        int n = scan.nextInt();
        double[] x = new double[n];
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o " + i + "º numero do primeiro vetor");
            x[i] = scan.nextDouble();
        }

        double[] y = new double[n];
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o " + i + "º numero do segundo vetor");
            y[i] = scan.nextDouble();
        }
        System.out.println(retorna(x, y));
    }

    public static double[] retorna(double[] x, double[] y) {
        if (x.length != y.length) {
            //return null
        }

        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] + y[i];
        }

        return x;
    }
}
