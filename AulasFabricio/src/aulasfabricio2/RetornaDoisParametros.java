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
public class RetornaDoisParametros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro numero ");
        int a = scan.nextInt();
        System.out.println("Digite o valor do segundo numero ");
        int b = scan.nextInt();
        System.out.println(retorna(a, b));
    }

    public static int retorna(int a, int b) {
        if (a > b) {
            return 1;
        } else if (b > a) {
            return -1;
        } else {
            return 0;
        }
    }
}
