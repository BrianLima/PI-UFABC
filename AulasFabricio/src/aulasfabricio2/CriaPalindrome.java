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
public class CriaPalindrome {

    public static void main(String[] args) {
        System.out.println("Digite o tamanho do vetor");
        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();
        int invertido = 0;
        inverte(valor);
        while(invertido != valor){
            invertido = inverte(valor);
            valor += invertido;
        }
        if (inverte(invertido) == valor) {
            System.out.println("O numero digitado é palíndrome");
        }
        

    }

    public static int inverte(int n) {
        int inverso = 0;
        while (n != 0) {
            inverso = inverso * 10 + (n % 10);
            n /= 10;
        }
        return inverso;
    }
}
