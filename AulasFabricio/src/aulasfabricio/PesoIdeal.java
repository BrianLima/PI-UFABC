package aulasfabricio;

/* Ex. 02: PesoIdeal.java
 * Verifique se a pessoa est� acima do peso recomendado
 * Entrada: sexo (int), altura, peso (double)
 * Sa�da:  acima do peso (bool)
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */

import java.util.Scanner;

class PesoIdeal
{
	public static void main(String[] args)
        {
            int sexo;
            double peso, altura, imc;
            Scanner leitor = new Scanner(System.in);

            // captura valores
            System.out.println("Homem (0) ou mulher (1)?: ");
            sexo = leitor.nextInt();
            System.out.println("Digite seu peso e sua altura: ");
            peso = leitor.nextDouble();
            altura = leitor.nextDouble();
            imc = peso / Math.pow(altura,2);
            String resultado;
            
            if(sexo == 0)
            {
                if(imc < 25.2 && imc > 18)
                {
                    resultado = ("Você está no seu peso ideal");
                }
                else if(imc > 25.2 && imc < 30.0)
                {
                    resultado = ("Você está com sobrepeso");
                }
                else if(imc > 30)
                {
                    resultado = ("Você está obeso");
                }
                else
                {
                    resultado = "Você está abaixo do peso";
                }
            }
            else
            {
               if(imc < 25 && imc > 18)
                {
                    resultado = ("Você está no seu peso ideal");
                }
                else if(imc > 25 && imc < 30.0)
                {
                    resultado = ("Você está com sobrepeso");
                }
                else if(imc > 30)
                {
                    resultado = ("Você está obeso");
                }
                else
                {
                    resultado = "Você está abaixo do peso";
                } 
            }
            System.out.println(resultado);
        }
}

