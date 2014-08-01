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

public class Collatz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de n");
        int n = scan.nextInt();
        System.out.println("O valor digitado foi " + n);
        int count = 0;
        while (n != 1) {
            if(n % 2 == 0)
            {
                n = 3*n + 1;
            }
            else{
                n = n/2;
            }
            count++;
        }
        
        System.out.print("O algoritmo da conjectura de Collatz foi executado " + count + " vezes para este numero");
    }
}
