/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasfabricio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class Bissexto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o inicio do intervalo de anos");
        int min = scanner.nextInt();
        
        System.out.println("Digite o fim do intervalo de anos");
        int max = scanner.nextInt();
        int count = 0;
        
        for (int i = min; i <= max; i++) {
            if (i % 4 == 0 && i % 100 != 0) {
                count++;
            } else if (i % 100 == 0 && i % 400 == 0) {
                count++;
            }
        }
        
        System.out.println("Há um total de " + count + " anos bissextos");
    }
}
