package aulasfabricio2;

import java.util.Random;
import javax.swing.JOptionPane;

public class MasterMind {

    public static void main(String[] args) {
        Random r = new Random();
        int senha1 = r.nextInt(10);
        int senha2 = r.nextInt(10);
        int tentativas = 0;
        String result = "";
        int a = -1;
        int b = -1;

        while (a != senha1 && b != senha2) {
            a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 0 a 9 para o primeiro valor:"));
            b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 0 a 9 para o segundo valor:"));
            tentativas = tentativas + 1;

            if (a > senha1 && a < 10) {
                result = "O primeiro número digitado é maior que o primeiro segredo ";
            } else if (a < senha1 && a >= 0) {
                result = "O primeiro número digitado é menor que o primeiro segredo ";
            } else if (a < 0 || a > 9) {
                result = "Primeiro Número inválido ";
            } else {
                result = "Você acertou o primeiro numero ";
            }

            if (b > senha2 && b < 10) {
                result += "O segundo número digitado é maior que o segundo segredo";
            } else if (b < senha2 && b >= 0) {
                result += "O segundo número digitado é menor que o segundo segredo";
            } else if (b < 0 || b > 9) {
                result += "Segundo Número inválido";
            } else {
                result += "Você acertou o segundo segredo";
            }
            JOptionPane.showMessageDialog(null, result);
        }
        JOptionPane.showMessageDialog(null, "Você Acertou com " + tentativas + " palpites!");
    }
}
