/* FizzBuzz.java
 * Para a sequ�ncia de n�meros de 1 at� 100
 * imprimir os n�meros em ordem crescente substituindo
 * m�ltiplos de 3 por Fizz, m�ltiplos de 5 por Buzz
 * e m�ltiplos de 3 e 5 por FizzBuzz
 * Entrada: nenhuma 
 * Sa�da: FizzBuzz
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */


class FizzBuzz{
	public static void main(String[] args) {
    for( int i = 1; i<=100; i++ ){
      if( (i%15)==0 ){ // m�ltiplos de 3 e 5 s�o m�ltiplos de 15!
        System.out.println("FizzBuzz");
      }else if( (i%3) == 0){
        System.out.println("Fizz");
      }else if( (i%5) == 0){
        System.out.println("Buzz");
      }else{
        System.out.println(i);
      }
    }

	}
}

