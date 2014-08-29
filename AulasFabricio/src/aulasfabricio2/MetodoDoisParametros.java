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
public class MetodoDoisParametros {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro numero ");
        int a = scan.nextInt();
        System.out.println("Digite o valor do segundo numero ");
        int b = scan.nextInt();
        imprime(a, b);
    }

    public static void imprime(int a, int b) {
        if (a > b) {
            System.out.println(1);
        } else if (b > a) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }
    }
}
