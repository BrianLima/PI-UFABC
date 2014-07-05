package aulasfabricio;

/* Ex. 03: Circunferencia.java
 * Dado o centro (cx, cy) e o raio (r) de uma circunfer�ncia
 * determinar se um ponto x,y est� dentro ou fora dela
 * Entrada:  cx, cy, r, x, y (double)
 * Sa�da:  Est� dentro ou fora
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */

import java.util.Scanner;

class Circunferencia{
	public static void main(String[] args) 
        {
		Scanner leitor = new Scanner(System.in);
                double px, py, r, cx, cy, distancia;
                System.out.println("Entre com as coordenadas do centro da circunferencia: ");
                px = leitor.nextDouble();
                py = leitor.nextDouble();
                System.out.println("Entre com o raio da circunferencia: ");
                r = leitor.nextDouble();

                System.out.println("Entre com as coordenadas do ponto: ");
                cx = leitor.nextDouble();
                cy = leitor.nextDouble();
                
                //Calculando a distância do ponto ao centro da circunferência
                distancia = Math.sqrt((Math.pow((px - cx), 2) + Math.pow((py- cy), 2)));
                
                if(distancia > r) 
                {
                    System.out.println("O ponto é externo a circunferência"); 
                }
                else
                {
                    System.out.println("O ponto pertence a circunferência");
                }

        }
}

