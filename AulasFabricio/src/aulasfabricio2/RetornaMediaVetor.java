/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasfabricio2;

import java.util.Scanner;

/*
 * @author Brian
 */
public class RetornaMediaVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros que você deseja calcular:");
        int n = scan.nextInt();
        double[] x = new double[n];
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o " + i + "º numero");
            x[i] = scan.nextDouble();
        }
        System.out.println(retorna(x));
    }

    public static double retorna(double[] x) {
        int media = 0;

        for (int i = 0; i < x.length; i++) {
            media += x[i];
        }

        media = media / x.length;

        return media;
    }
}
