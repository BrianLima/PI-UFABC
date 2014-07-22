package aulasfabricio2;

/* Palindrome.java
 * verificar se uma String �
 * uma palindrome.
 * Entrada: String s 
 * Sa�da: sim ou n�o 
 * Autor: Fabr�cio Olivetti de Fran�a
 */
import java.util.Scanner;

class Palindrome {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String s = leitor.nextLine();

        boolean palindrome = true;
        for (int i = 0; i < (s.length() / 2) + 1; i++) { // s� preciso verificar at� o meio
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println("é palindromo");
        } else {
            System.out.println("não é palíndrome");
        }
    }
}
