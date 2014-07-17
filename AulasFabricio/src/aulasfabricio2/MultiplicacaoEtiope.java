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

public class MultiplicacaoEtiope {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor de M");
        int m = leitor.nextInt();
        System.out.println("Digite o valor de N");
        int n = leitor.nextInt();

        int soma = 0;

        while (m >= 1) {
            //System.out.println(m + " | " + n);
            if (impar(m)) { soma = soma + n; }
            System.out.println(soma);
            m = m / 2;
            n = n * 2;
        }
    }

    public static boolean impar(int i) {
        return i % 2 != 0;
    }
}
