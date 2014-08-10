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
public class Taylor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x, Sum, Ti;
        int i, n, F;

        x = scan.nextDouble();
        n = scan.nextInt();

/// s = 1 + x + x*x/2! + .. + pow(x,n)/n!
        i = 0;
        Ti = 1;
        Sum = 1;
        do {
            i++;
            Ti = Ti * (x / i);
            Sum = Sum + Ti;
        } while (i
jTextPane3.setText(String.valueOf(Sum));
        jTextPane4.setText("+- " + String.valueOf(Ti));

    }
}
