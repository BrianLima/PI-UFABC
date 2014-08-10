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

public class MediaInfinita {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int media = 0;

        System.out.println("Digite a quantidade de numeros que você deseja calcular:");
        int n = scanner.nextInt();
        int[] x = new int[n];

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o " + i + "º numero");
            x[i] = scanner.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += x[i];
        }

        sum = sum / n;
        
        System.out.println("A média arredondada dos valores é " + sum);
    }
}
