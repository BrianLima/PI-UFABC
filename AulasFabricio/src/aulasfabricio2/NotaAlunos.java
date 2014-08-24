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
public class NotaAlunos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos que compõem a turma");
        int total = scanner.nextInt();

        float[][] notas = new float[total][3];

        for (int i = 0; i < total; i++) {
            for (int j = 0; j < 3; j++) {
                String prova;
                if (j == 0) {
                    prova = "p1";
                } else if (j == 1) {
                    prova = "p2";
                } else {
                    prova = "sub";
                }
                System.out.println("Digite a nota da " + prova + " do aluno");
                notas[i][j] = scanner.nextFloat();
            }
        }

        for (int i = 0; i < total; i++) {
            if (passou(notas[i])) {
                System.out.println("O " +  (i+1) + "º aluno passou");
            } else {
                System.out.println("O " +  (i+1) + "º aluno não passou");
            }
        }
    }

    public static boolean passou(float[] aluno) {
        float[] notas = MaioresNotas(aluno);

        if (notas[0] / notas[1] > 5) {
            return false;
        } else {
            return true;
        }
    }

    // x > z > y
    // y > x > z
    // y > z > y
    // x > y > z
    // z > x > y
    // z > y > x
    public static float[] MaioresNotas(float[] aluno) {
        float[] notas = new float[2];

        if (aluno[0] > aluno[1] && aluno[0] > aluno[2]) {
            notas[0] = aluno[0];
            if (aluno[1] > aluno[2]) {
                notas[1] = aluno[1];
            } else {
                notas[1] = aluno[2];
            }
        } else if (aluno[1] > aluno[0] && aluno[1] > aluno[2]) {
            notas[0] = aluno[1];
            if (aluno[0] > aluno[2]) {
                notas[0] = aluno[0];
            } else {
                notas[0] = aluno[2];
            }
        } else if (aluno[2] > aluno[0] && aluno[2] > aluno[1]) {
            notas[0] = aluno[2];
            if (aluno[0] > aluno[1]) {
                notas[1] = aluno[0];
            } else {
                notas[1] = aluno[1];
            }
        }

        return notas;
    }

}
