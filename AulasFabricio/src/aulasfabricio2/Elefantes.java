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

public class Elefantes {

    public static void main(String[] args) {

        System.out.println("Para quantos elefantes devo cantar?");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int incomoda;
        for (int i = 1; i <= count; i++) {
            incomoda = 0;
            if (i == 1) {
                System.out.println(i + " Elefante incomoda muita gente");
            } else {
                if (i % 2 == 0) {
                    System.out.println(i + " Elefantes");
                    while (incomoda < i) {
                        System.out.print(" incomodam ");
                        incomoda++;
                    }
                    System.out.print("muita gente ");
                } else {
                    System.out.println(i + " elefantes");
                    while (incomoda < i) {
                        System.out.print(" incomodam ");
                        incomoda++;
                    }
                    System.out.print(" muito mais ");
                }
            }
        }
    }
}
