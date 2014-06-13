/* Vetores.java
 * Leitura de uma lista de valores
 * c�lculo da m�dia, vari�ncia,
 * desvio-padr�o e menor e maior
 * elementos.
 * Entrada: double [] x
 * Sa�da: media, var, desvpad, menor, maior
 * Autor: Fabr�cio Olivetti de Fran�a
 */

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class Vetores{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner leitor = new Scanner(new File("lista.csv")); // agora vou ler do arquivo
		leitor.useDelimiter("\\s*;\\s*|\\r?\\n"); // separado por v�rgula
		int n = leitor.nextInt();
		double [] x = new double[n];
		for( int i=0; i<n; i++ ){
			x[i] = leitor.nextDouble();
		}
		leitor.close();

    double media = 0.0, var = 0.0, desvpad = 0.0;
    double menor, maior;
    int menorIdx, maiorIdx;

    for( int i=0; i<n; i++ ){ // m�dia = soma(x)/n
      media += x[i];
    }
    media /= n;
    System.out.println("M�dia = "+media);

    for( int i=0; i<n; i++ ){  // vari�ncia = (x-media)^2 / n
      var += (x[i]-media)*(x[i]-media);
    }
    var /= n;
    desvpad = Math.sqrt(var);    //desvio-padr�o = raiz(vari�ncia)
    System.out.println("Vari�ncia = "+var);
    System.out.println("Desvio-padr�o = "+desvpad);

    menorIdx = 0;
    maiorIdx = 0;
    menor = x[0];
    maior = x[0];
    for( int i=1; i<n; i++ ){  // quem � o maior?
      if( x[i] > maior ){
        maior = x[i];
        maiorIdx = i;
      }
      if( x[i] < menor ){ // quem � o menor?
        menor = x[i];
        menorIdx = i;
      }
    }
    System.out.println("Maior valor = "+maior+" na posi��o "+maiorIdx);
    System.out.println("Menor valor = "+menor+" na posi��o "+menorIdx);

    leitor = new Scanner(System.in);
    System.out.println("Digite um valor para buscar: ");
    double val = leitor.nextDouble();
    int i = 0;
    for( ; i<n; i++ ){
      if( x[i] == val )   // assim que encontrar o valor, n�o precisa procurar mais!
        break;
    }
    if( i<n ){
      System.out.println("elemento encontrado em: "+i);
    }else{
      System.out.println("elemento n�o existe");
    }

	}
}

