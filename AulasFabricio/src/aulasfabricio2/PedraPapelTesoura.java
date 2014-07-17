package aulasfabricio2;

/* PedraPapelTesoura.java
 * Dada duas entradas nos valores 0 (pedra), 1 (papel) ou 2 (tesoura), 
 * verificar quem ganho o jogo.
 * Entrada: jogador1, jogador2 (int)
 * Sa�da:  jogador1 ganhou, jogador2 ganhou, empate
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */
import java.util.Scanner;

class PedraPapelTesoura {

    public static void main(String[] args) {
        int jogador1 = 3, jogador2 = 3;
        Scanner leitor = new Scanner(System.in);

        // captura valores
        while (jogador1 > 2 || jogador2 > 2) {
            System.out.println("Jogador 1 (0 - Pedra, 1 - Papel, 2 - Tesoura): ");
            jogador1 = leitor.nextInt();
            System.out.println("Jogador 2 (0 - Pedra, 1 - Papel, 2 - Tesoura): ");
            jogador2 = leitor.nextInt();

            if (jogador1 > 2 || jogador2 > 2) {
                System.out.println("Entrada de dados inválida, tente novamente.");
            }
        }
        if ((jogador1 > jogador2 || jogador1 == 0 && jogador2 == 2) && !(jogador1 == 0 && jogador2 == 1)) {
            System.out.println("Jogador 1 venceu");
        } else if ((jogador2 > jogador1 || jogador1 == 2 && jogador2 == 0)) {
            System.out.println("Jogador 2 venceu");
        } else {
            System.out.println("Empate");
        }
    }
}
