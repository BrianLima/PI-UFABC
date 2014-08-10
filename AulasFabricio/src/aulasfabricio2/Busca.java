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
public class Busca {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] x = new int[n];
        
        int y = scanner.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            if (x[i] == y) {
                System.out.println("O numero que você digitou está no grupo informado");
                break;
            }
        }
        if (i+1 == n) {
            System.out.println("O numero pedido não está no grupo informado");
        }
    }
}
