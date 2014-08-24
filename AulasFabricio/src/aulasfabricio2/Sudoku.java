/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasfabricio2;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class Sudoku {

    int[] vetor;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] sudoku = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("Digite o valor da casa " + i + "x" + j + " do sudoku");
                sudoku[i][j] = scan.nextInt();
            }
        }

        boolean valido = true;
        //Verificando linhas
        for (int i = 0; i < 9; i++) {
            valido = linha(sudoku[i]);
            if (!valido) {
                break;
            }
        }

        if (valido) {
            //transformando colunas em linhas para verificar se são válidas
            int[] coluna = new int[9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 10; j++) {
                    coluna[j] = sudoku[j][i];
                }
                valido = linha(coluna);
                if (!valido) {
                    break;
                }
            }
        } else {
            System.out.println("Seu sudoku não é valido");
        }

        //Transformando quadrados em linhas para verificar se são validos
        if (valido) {
            for (int i = 1; i <= 3; i++) {
                valido = linha(quadrado(i, sudoku));
                if (!valido) {
                    break;
                }
            }
        } else {
            System.out.println("Seu sudoku não é valido");
        }

        if (valido) {
            System.out.println("Seu sudoku é valido!");
        }
    }

    public static int[] quadrado(int fator, int[][] sudoku) {
        int indiceX, indiceY;
        indiceX = indiceY = 1 * fator;
        int[] quadrado = new int[9];

        while (indiceX <= 3 * fator) {
            while (indiceY <= 3 * fator) {
                quadrado[ (indiceX * indiceY) - 1] = sudoku[indiceX][indiceY];
            }
        }
        return quadrado;
    }

    public static boolean linha(int[] linha) {
        linha = ordena(linha);
        for (int i = 1; i < 10; i++) {
            if (linha[i - 1] != i) {
                return false;
            }
        }
        return true;
    }

    public static int[] ordena(int[] a) {
        int aux = 0;
        for (int x = 0; x < a.length; x++) {
            for (int y = x + 1; y < a.length; y++) {
                if (a[x] < a[y]) {
                    aux = a[x];
                    a[x] = a[y];
                    a[y] = aux;
                }
            }
        }
        return a;
    }
}
