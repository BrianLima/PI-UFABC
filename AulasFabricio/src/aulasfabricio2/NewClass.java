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
public class NewClass {

    public static void main(String[] args) {
        double x,//x-coordinate of the random point
                y,//y-coordinate of the random point
                Pi,//the calculated number pi
                P;//probability of random points
        int j = 0,//number of points in the circle and square
                i; //counter
        int CONT = (int) (Math.pow(10, 8));
        for (i = 1; i < CONT; i++) {
            x = Math.random();//create random x
            y = Math.random();//create random y
            if (x * x + y * y < 1) //the point is in cutting area
            {
                j++;
            }
        }
        System.out.println("Random produced points " + j + " of " + i);
        P = (double) j / (double) i; //calculate propability
        Pi = P * 4; //calculate Pi
        System.out.println("Calculated Pi is: " + Pi);//print out Calculated Pi
        System.out.println("Math.PI = " + Math.PI); //print out Pi
    }
}
