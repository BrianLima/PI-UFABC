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

public class PingPong {

    public static void main(String[] args) {
        boolean printed = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero de vezes que o programa deve contar");
        int count = scan.nextInt();
        for (int i = 1; i <= count; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Ping-Pong");
                printed = true;
            }
            if (i % 3 == 0 && !printed) {
                System.out.println("Ping");
            } else if (i % 5 == 0 && !printed) {
                System.out.println("Pong");
            } else if(!printed) {
                System.out.println(i);
            }
             printed = false;
        }

    }
}
